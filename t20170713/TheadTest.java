package t20170713;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

public class TheadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() -> {
			try {
				Selector selector = Selector.open();
				RandomAccessFile aFile = new RandomAccessFile("D:\\data\\nio-data.txt", "rw");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
	}

}
