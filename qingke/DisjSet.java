package qingke;

import java.util.ArrayList;  

/** 
 * 不相交集类 
 *  
 * @author Holy-Spirit 
 *  
 */  
  
public class DisjSet {  
  
    private int length;  
    private int[] array;  
  
    /** 
     * 初始化数组为-1 
     *  
     * 其中符号，代表的是这是根节点，也就是表示这个下标是这棵树的标志 符号后面的值为这棵树节点的个数，或者是高度值 
     *  
     * 如果大于0，说明这是树的子节点，里面存放的是父节点的下标 
     *  
     * @param length 
     *            数组的长度 
     */  
  
    public DisjSet(int length) {  
  
        if (length <= 0) {  
            System.out.println("数组初始化长度有误");  
            return;  
        }  
        array = new int[length];  
        this.length = array.length;  
        for (int i = 0; i < array.length; i++) {  
            array[i] = -1;  
  
        }  
  
    }  
  
    /** 
     * 获取一个下标所在的整个集合的值 
     *  
     * @param index 
     *            下标值 
     * @return 整个集合的List 
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
     *            需要返回的List对象 
     * @param parentRoot 
     *            父节点 
     * @param count 
     *            这个集合的节点个数 
     * @return 集合List 
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
     * 获取这个数组长度 
     *  
     * @return 
     */  
  
    public int length() {  
  
        return this.length;  
    }  
  
    /** 
     * 判断是否全部合并 
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
     * 通过比较两个集合的个数来决定谁被归并 每次归并，在根节点，存放整个集合中节点的个数 
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
     * 通过集合的高度进行归并 
     *  
     * 高度小的集合称为高度大的树的子节点 
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
     * 路径压缩的查找方式 通过根的下标来标识树集合 
     *  
     * 路径压缩的思想是，union的最后或多或少会破坏一棵树的平衡性 所以每次 
     * find后，都将这个find的位置中存放的父节点的下标值改成根节点的下标，这样一来，树的高度将变小。但是 
     *  
     * @param x 
     * @return 最终返回的是这个集合的根节点，因为根节点中存放着这棵树的大小或者高度 
     */  
  
    public int find(int x) {  
        if (array[x] < 0) {  
            return x;  
        } else {  
            return array[x] = find(array[x]);  
        }  
    }  
  
}  