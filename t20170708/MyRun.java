package t20170708;

public class MyRun implements Runnable{   
    protected int countDown = 10; //Default   
    private static int taskCount = 0;   
    private final int id = taskCount++;    
    public MyRun() {}   
    public MyRun(int countDown) {   
        this.countDown = countDown;   
    }   
    public String status() {   
        return "#" + id + "(" +   
            (countDown > 0 ? countDown : "LiftOff!") + ") ";   
    }   
    @Override   
    public void run() {   
        while(countDown-- > 0) {   
            System.out.println(status());   
            Thread.yield();   
        }   
           
    }      
} 
