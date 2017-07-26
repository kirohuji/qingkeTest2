package t20170710;

public class BSTree<T extends Comparable<T>> {
	//¸ù½Úµã
	private BSTNode<T> mRoot;
	
	
	public class BSTNode<T extends Comparable<T>>{
		T key;
		BSTNode<T> left;
		BSTNode<T> right;
		BSTNode<T> parent;
		public BSTNode(T key,BSTNode<T> left,BSTNode<T> right,BSTNode<T> parent) {
			super();
			this.key = key;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
		public T getKey() {
			return key;
		}
		public void setKey(T key) {
			this.key = key;
		}
		public BSTNode<T> getLeft() {
			return left;
		}
		public void setLeft(BSTNode<T> left) {
			this.left = left;
		}
		public BSTNode<T> getRight() {
			return right;
		}
		public void setRight(BSTNode<T> right) {
			this.right = right;
		}
		public BSTNode<T> getParent() {
			return parent;
		}
		public void setParent(BSTNode<T> parent) {
			this.parent = parent;
		}
	}
	private void preOrder(BSTNode<T> tree){
		if(tree!=null){
			System.out.println(tree.key+" ");
			preOrder(tree.left);
			preOrder(tree.right);
		}
	}
	public void preOrder(){
		preOrder(mRoot);
	}
	public void inOrder(){
		inOrder(mRoot);
	}
	private void inOrder(BSTNode<T> tree){
		if(tree!=null){
			inOrder(tree.left);
			System.out.println(tree.key+" ");
			inOrder(tree.right);
		}
	}
	public void postOrder(){
		postOrder(mRoot);
	}
	private void postOrder(BSTNode<T> tree){

	}
	
}
