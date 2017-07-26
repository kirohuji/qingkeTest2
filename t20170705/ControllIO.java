package t20170705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;

public class ControllIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			byte[] buff=new byte[5];
			
			int val=System.in.read(buff);
			System.out.println(val);
		}catch(IOException e){
			e.printStackTrace();
		}
			InputStream in=System.in;
			InputStreamReader charsIn=new InputStreamReader(in);
			BufferedReader bufferedCharsIn=new BufferedReader(charsIn);
		    String line;
			try {
				line = bufferedCharsIn.readLine();
				int i=NumberFormat.getInstance().parse(line).intValue();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
	}

}
