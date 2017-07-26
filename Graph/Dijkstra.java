package Graph;
public class Dijkstra{
    public static final int M = -1;

    public static void main(String[] args){
        int[][] map1 = { 
                { 0,  7,  9,  M,  M, 14 }, 
                { 7,  0,  10, 15, M, M },
                { 9,  10, 0,  11, M, 2 }, 
                { M,  15, 11, 0,  6, M },
                { M,  M,  M,  6,  0, 9 }, 
                { 14, M,  2,  M,  9, 0 } };
        for(int orig=0;orig<6;orig++){
        	 int[] shortPath = dijkstra_alg(map1, orig);
        	 if (shortPath == null)
                 return;
             
             for (int i = 0; i < shortPath.length; i++){
                 System.out.println("��" + (orig + 1) + "������" + (i + 1) + "����̾���Ϊ��"
                         + shortPath[i]);
             }
        }
    }

    public static int[] dijkstra_alg(int[][] weight, int orig){
        int n = weight.length;              // �������

        int[] shortest = new int[n];        // ��Ŵ�start��������������·��
        boolean[] visited = new boolean[n]; // ��ǵ�ǰ�ö�������·���Ƿ��Ѿ������true��ʾ�����

        // ��ʼ������һ���������
        shortest[orig] = 0;
        visited[orig] = true;

        for (int count = 0; count != n - 1; count++){ // Ҫ����n-1������
            // ѡ��һ�������ʼ���������δ��Ƕ���
            int k = M;     
            int dmin = M;
            for (int i = 0; i < n; i++){
                if (!visited[i] && weight[orig][i] != M){
                     if (dmin == -1 || dmin > weight[orig][i]) {
                         dmin = weight[orig][i];
                         k = i;
                     }
                }
            }

            // ��ȷ��ͼ���ɵľ��󲻿��ܳ���K == M�����
            if (k == M){
                System.out.println("the input map matrix is wrong!");
                return null;
            }
            
            shortest[k] = dmin;
            visited[k] = true;

            // ��kΪ�м�㣬������ԭ�㵽δ���ʸ���ľ���
            for (int i = 0; i < n; i++){
                if (!visited[i] && weight[k][i] != M)  {
                    int callen = dmin + weight[k][i];
                    if (weight[orig][i] == M || weight[orig][i] > callen){
                        weight[orig][i] = callen;
                    }
                }
            }
        }

        return shortest;
    }
}