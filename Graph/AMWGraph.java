package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @description �ڽӾ���ģ����
 * @author beanlam
 * @time 2015.4.17 
 */
public class AMWGraph {
    private ArrayList vertexList;//�洢�������
    private int[][] edges;//�ڽӾ��������洢��
    private int numOfEdges;//�ߵ���Ŀ

    public AMWGraph(int n) {
        //��ʼ������һά���飬�ͱߵ���Ŀ
        edges=new int[n][n];
        vertexList=new ArrayList(n);
        numOfEdges=0;
    }

    //�õ����ĸ���
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //�õ��ߵ���Ŀ
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //���ؽ��i������
    public Object getValueByIndex(int i) {
        return vertexList.get(i);
    }

    //����v1,v2��Ȩֵ
    public int getWeight(int v1,int v2) {
        return edges[v1][v2];
    }

    //������
    public void insertVertex(Object vertex) {
        vertexList.add(vertexList.size(),vertex);
    }

    //������
    public void insertEdge(int v1,int v2,int weight) {
        edges[v1][v2]=weight;
        numOfEdges++;
    }

    //ɾ�����
    public void deleteEdge(int v1,int v2) {
        edges[v1][v2]=0;
        numOfEdges--;
    }

    //�õ���һ���ڽӽ����±�
    public int getFirstNeighbor(int index) {
        for(int j=0;j<vertexList.size();j++) {
            if (edges[index][j]>0) {
                return j;
            }
        }
        return -1;
    }

    //����ǰһ���ڽӽ����±���ȡ����һ���ڽӽ��
    public int getNextNeighbor(int v1,int v2) {
        for (int j=v2+1;j<vertexList.size();j++) {
            if (edges[v1][j]>0) {
                return j;
            }
        }
        return -1;
    }
}