package textGraph;

public class Dijkstra {
	// -1为无穷
	public static final int M = -1;

	public static void main(String[] args) {
		//建立邻接矩阵
		int[][] map = { 
				{ 0, 7, 9, M, M, 14 }, 
				{ 7, 0, 10, 15, M, M }, 
				{ 9, 10, 0, 11, M, 2 },
				{ M, 15, 11, 0, 6, M },
				{ M, M, M, 6,  0,  9 },
				{ 14, M, 2, M, 9, 0 } };
		//建立一个初始结点的最短路径的一维数组进行存储第一个顶点到每个顶点的距离
		for(int origin=0;origin<6;origin++){
			//获取最短路径
			int[] shortPath=dijkstra_alg(map,origin);
			if(shortPath==null)
				return;
			//输出结果
			 for (int i = 0; i < shortPath.length; i++){
                 System.out.println("从" + (origin + 1) + "出发到" + (i + 1) + "的最短距离为："
                         + shortPath[i]);
             }
		}
	}

	private static int[] dijkstra_alg(int[][] weight, int origin) {
		//顶点个数
		int n=weight.length;
		//
		int[] shortest=new int[n];
		boolean[] visited=new boolean[n];
		//初始化，第一个顶点求出
		shortest[origin]=0;
		visited[origin]=true;
		//遍历开始
		for(int count=0;count!=n-1;count++){
			//获取每一个距离初始顶点最近的未标记顶点
			int k=M;
			int dmin=M;
			for(int i=0;i<n;i++){
				//没有被访问和距离不为无限
				if(!visited[i]&&weight[origin][i]!=M){
					if(dmin==-1||dmin>weight[origin][i]){
						dmin=weight[origin][i];
						k=i;
					}
				}
			}
			//冲突
			if(k==M){
				System.out.println("the input map matrix is wrong");
				return null;
			}
			//开始访问
			shortest[k]=dmin;
			visited[k]=true;
			//以K为中间点，修正原点到未访问各点的距离
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
