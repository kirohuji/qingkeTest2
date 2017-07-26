package qingke;

import java.util.ArrayList;  

/** 
 * ���ཻ���� 
 *  
 * @author Holy-Spirit 
 *  
 */  
  
public class DisjSet {  
  
    private int length;  
    private int[] array;  
  
    /** 
     * ��ʼ������Ϊ-1 
     *  
     * ���з��ţ�����������Ǹ��ڵ㣬Ҳ���Ǳ�ʾ����±���������ı�־ ���ź����ֵΪ������ڵ�ĸ����������Ǹ߶�ֵ 
     *  
     * �������0��˵�����������ӽڵ㣬�����ŵ��Ǹ��ڵ���±� 
     *  
     * @param length 
     *            ����ĳ��� 
     */  
  
    public DisjSet(int length) {  
  
        if (length <= 0) {  
            System.out.println("�����ʼ����������");  
            return;  
        }  
        array = new int[length];  
        this.length = array.length;  
        for (int i = 0; i < array.length; i++) {  
            array[i] = -1;  
  
        }  
  
    }  
  
    /** 
     * ��ȡһ���±����ڵ��������ϵ�ֵ 
     *  
     * @param index 
     *            �±�ֵ 
     * @return �������ϵ�List 
     */  
  
    public ArrayList<Integer> getDisjMember(int index) {  
        int count = array[index] < 0 ? (array[index] * -1)  
                : (array[find(index)] * -1);  
        ArrayList<Integer> list = new ArrayList<>();  
        list.add(index);  
        findAll(list, index, count);  
        return list;  
    }  
  
    /** 
     * @param list 
     *            ��Ҫ���ص�List���� 
     * @param parentRoot 
     *            ���ڵ� 
     * @param count 
     *            ������ϵĽڵ���� 
     * @return ����List 
     */  
    private ArrayList<Integer> findAll(ArrayList<Integer> list, int parentRoot,  
            int count) {  
  
        if (count == 0) {  
            return list;  
        }  
  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] == parentRoot) {  
                list.add(i);  
                findAll(list, i, count--);  
            }  
        }  
  
        return list;  
    }  
  
    /** 
     * ��ȡ������鳤�� 
     *  
     * @return 
     */  
  
    public int length() {  
  
        return this.length;  
    }  
  
    /** 
     * �ж��Ƿ�ȫ���ϲ� 
     *  
     * @return 
     */  
  
    public boolean isUnionAll() {  
  
        boolean isUnionAll = false;  
  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] < 0) {  
  
                if (isUnionAll) {  
                    isUnionAll = !isUnionAll;  
                    break;  
                }  
                isUnionAll = !isUnionAll;  
  
            }  
  
        }  
  
        return isUnionAll;  
    }  
  
    /** 
     * ͨ���Ƚ��������ϵĸ���������˭���鲢 ÿ�ι鲢���ڸ��ڵ㣬������������нڵ�ĸ��� 
     *  
     * @param root1 
     * @param root2 
     */  
  
    public void unionBySzie(int root1, int root2) {  
  
        int sumSize = array[root1] + array[root2];  
  
        if (array[root1] > array[root2]) {  
            array[root2] = sumSize;  
            array[root1] = root2;  
        } else {  
            array[root1] = sumSize;  
            array[root2] = root1;  
        }  
  
    }  
  
    /** 
     * ͨ�����ϵĸ߶Ƚ��й鲢 
     *  
     * �߶�С�ļ��ϳ�Ϊ�߶ȴ�������ӽڵ� 
     *  
     * @param root1 
     * @param root2 
     */  
  
    public void unionByHeigh(int root1, int root2) {  
  
        if (array[root1] < array[root2]) {  
            array[root1] = root2;  
        } else {  
            if (array[root1] == array[root2]) {  
                array[root1]--;  
            }  
            array[root2] = root1;  
  
        }  
  
    }  
  
    /** 
     * ·��ѹ���Ĳ��ҷ�ʽ ͨ�������±�����ʶ������ 
     *  
     * ·��ѹ����˼���ǣ�union���������ٻ��ƻ�һ������ƽ���� ����ÿ�� 
     * find�󣬶������find��λ���д�ŵĸ��ڵ���±�ֵ�ĳɸ��ڵ���±꣬����һ�������ĸ߶Ƚ���С������ 
     *  
     * @param x 
     * @return ���շ��ص���������ϵĸ��ڵ㣬��Ϊ���ڵ��д����������Ĵ�С���߸߶� 
     */  
  
    public int find(int x) {  
        if (array[x] < 0) {  
            return x;  
        } else {  
            return array[x] = find(array[x]);  
        }  
    }  
  
}  