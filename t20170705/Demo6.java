package t20170705;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo6 {
	public static void main(String[] args) throws IOException{
		PrintStream ps=new PrintStream("out.txt");
		ps.println(10086);
		ps.println(false);
		ps.println();
		ps=System.out;
		ps.println("nihao");
		PrintWriter pr=new PrintWriter("out2.txt");
		pr=new PrintWriter(new FileWriter("out2.txt"),true);
		pr.print("hhaha");
		pr=new PrintWriter(System.out,true);
		pr.println(false);
		pr.println(234);
		
	}
}
