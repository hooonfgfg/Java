package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) throws Exception{
		
		String filePath="C:/Spring/Projects/Team3Project/src/ch18/exam19/data.txt";
		OutputStream os=new FileOutputStream(filePath);
		
		String data1="안녕하세요1";
		String data2="이제 마쳐요";
		
		/*
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());
		os.flush();
		os.close();*/
		
		PrintWriter out=new PrintWriter(os);
		out.println(3);
		out.println(10.5);
		out.flush();
		out.close();
	}

}
