package t20170701;

public interface Formula {
	double calculate(int a);
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
