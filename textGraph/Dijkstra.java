package textGraph;

public class Dijkstra {
	// -1Ϊ����
	public static final int M = -1;

	public static void main(String[] args) {
		//�����ڽӾ���
		int[][] map = { 
				{ 0, 7, 9, M, M, 14 }, 
				{ 7, 0, 10, 15, M, M }, 
				{ 9, 10, 0, 11, M, 2 },
				{ M, 15, 11, 0, 6, M },
				{ M, M, M, 6,  0,  9 },
				{ 14, M, 2, M, 9, 0 } };
		//����һ����ʼ�������·����һά������д洢��һ�����㵽ÿ������ľ���
		for(int origin=0;origin<6;origin++){
			//��ȡ���·��
			int[] shortPath=dijkstra_alg(map,origin);
			if(shortPath==null)
				return;
			//������
			 for (int i = 0; i < shortPath.length; i++){
                 System.out.println("��" + (origin + 1) + "������" + (i + 1) + "����̾���Ϊ��"
                         + shortPath[i]);
             }
		}
	}

	private static int[] dijkstra_alg(int[][] weight, int origin) {
		//�������
		int n=weight.length;
		//
		int[] shortest=new int[n];
		boolean[] visited=new boolean[n];
		//��ʼ������һ���������
		shortest[origin]=0;
		visited[origin]=true;
		//������ʼ
		for(int count=0;count!=n-1;count++){
			//��ȡÿһ�������ʼ���������δ��Ƕ���
			int k=M;
			int dmin=M;
			for(int i=0;i<n;i++){
				//û�б����ʺ;��벻Ϊ����
				if(!visited[i]&&weight[origin][i]!=M){
					if(dmin==-1||dmin>weight[origin][i]){
						dmin=weight[origin][i];
						k=i;
					}
				}
			}
			//��ͻ
			if(k==M){
				System.out.println("the input map matrix is wrong");
				return null;
			}
			//��ʼ����
			shortest[k]=dmin;
			visited[k]=true;
			//��KΪ�м�㣬����ԭ�㵽δ���ʸ���ľ���
			for(int i=0;i<n;i++){
				if(!visited[i]&&weight[k][i]!=M){
					int callen=dmin+weight[k][i];
					if(weight[origin][i]==M||weight[origin][i]>callen){
						weight[origin][i]=callen;
					}
				}
			}
		}
		return shortest;
	}
}
