package t20170630;

public class WolfQueen {
	int max=8;
	int[] array=new int[max];
	public static void main(String[] args){
		new WolfQueen().check(0);
	}
	private void check(int n) {
		// TODO Auto-generated method stub
		if(n==max){
			print();
			return;
		}
		for(int i=0;i<max;i++){
			array[n]=i;
			if(judege(n)){
				check(n+1);
			}
		}
	}
	private boolean judege(int n) {
		for(int i=0;i<n;i++){
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
		}
		return true;
	}
	private void print(){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]+1+" ");
		}
		System.out.println();
	}
}
