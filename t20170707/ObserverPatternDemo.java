package t20170707;

public class ObserverPatternDemo {
	public static void main(String[] args){
		Subject subject=new Subject();
		new BinaryObserver(subject);
		subject.setState(15);
	}
}
