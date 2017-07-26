package t20170711;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentPersistant {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student s = new Student("Zyd", "Male", 20);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.out"));
		System.out.println(s.toString());
		oos.writeObject(s);
		oos.flush();
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.out"));
		Student s2 = (Student) ois.readObject();
		System.out.println(s2.toString());
		ois.close();
	}
}
