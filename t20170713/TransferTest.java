package t20170713;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferTest {
	public static void main(String[] args) throws IOException{
		RandomAccessFile from=new RandomAccessFile("D:\\data\\from.txt","rw");
		RandomAccessFile to=new RandomAccessFile("D:\\data\\to.txt","rw");
		FileChannel fromChannel=from.getChannel();
		FileChannel toChannel=to.getChannel();
		long position=0;
		long count=fromChannel.size();
		toChannel.transferFrom(fromChannel, count, position);
	}
}
