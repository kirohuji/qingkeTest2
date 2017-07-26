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
			
		}
	}
}
