package Graph;
/**
 * @description AMWGraph��Ĳ�����
 * @author beanlam
 * @time 2015.4.17
 */
public class TestAMWGraph {
    public static void main(String args[]) {
        int n=4,e=4;//�ֱ����������ͱߵ���Ŀ
        String labels[]={"V1","V1","V3","V4"};//���ı�ʶ
        AMWGraph graph=new AMWGraph(n);
        for(String label:labels) {
            graph.insertVertex(label);//������
        }
        //����������
        graph.insertEdge(0, 1, 2);
        graph.insertEdge(0, 2, 5);
        graph.insertEdge(2, 3, 8);
        graph.insertEdge(3, 0, 7);

        System.out.println("�������ǣ�"+graph.getNumOfVertex());
        System.out.println("�ߵĸ����ǣ�"+graph.getNumOfEdges());

        graph.deleteEdge(0, 1);//ɾ��<V1,V2>��
        System.out.println("ɾ��<V1,V2>�ߺ�...");
        System.out.println("�������ǣ�"+graph.getNumOfVertex());
        System.out.println("�ߵĸ����ǣ�"+graph.getNumOfEdges());
    }
}
