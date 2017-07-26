package Graph;

import java.util.Scanner;
public class BellmanFord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //��㣬�յ㣬Ȩֵ����̾���
        int[] fromVertex, toVertex, weightVertex, dis, preNode;
        //�����������
        int n, m;
        //�������
        int Inf = 999;
        n = in.nextInt();
        m = in.nextInt();

        //��ʼ������
        fromVertex = new int[m];
        toVertex = new int[m];
        weightVertex = new int[m];
        dis = new int[n];
        preNode = new int[n];

        for (int i = 0; i < m; i++) {
            fromVertex[i] = in.nextInt();
            toVertex[i] = in.nextInt();
            weightVertex[i] = in.nextInt();
        }
        //��ʼ��dis
        dis[0] = 0;
        preNode[0] = 1;
        for (int i = 1; i < n; i++) {
            dis[i] = Inf;
        }

        boolean flag;
        //��ʼ����ߣ�Ѱ�����·��
        for (int k = 0; k < n - 1; k++) {
            flag = true;
            for (int i = 0; i < m; i++) {
                if (dis[toVertex[i] - 1] > dis[fromVertex[i] - 1] + weightVertex[i]) {
                    dis[toVertex[i] - 1] = dis[fromVertex[i] - 1] + weightVertex[i];
                    //��¼�յ㶥���ǰһ������
                    //�������·����Ŀ�궥���ǰһ���㵽Ŀ�궥��һ�����
                    preNode[toVertex[i] - 1] = fromVertex[i];
                    flag = false;
                    //System.out.println("from " + fromVertex[i] + " to " + toVertex[i] + " i=" + (i+1));
                    //�տ�ʼ��������ô���·�����ʹ�ӡ��һ��
                    //System.out.println("pre " + toVertex[i] + " from " + fromVertex[i] + " i=" + (i+1));
                }
            }
            //���û�и��¹����·������ʾ���·��Ѱ����ϡ�
            if (flag) {
                break;
            }
        }

        //�������1����������֮������·���;���
        for (int i = 0; i < 5; i++) {
            showPath(preNode, 1, i+1);
            System.out.println(" ���룺" + dis[i]);
        }
    }
    public static void showPath(int[] path, int from, int to) {
        int pre;
        if (from == to) {
            System.out.print(to + " ");
            return;
        }
        pre = path[to - 1];
        showPath(path, from, pre);
        System.out.print(" " + to + " ");
    }
}