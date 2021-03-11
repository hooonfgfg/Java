package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
		String filePath="D:/Team3Projects/Project1/src/ch18/exam01/data.txt";
		try {
			InputStream is=new FileInputStream(filePath);
			//방법1
			/*while(true) {
				int data=is.read();
				if(data==-1) {
					break;
				}
				System.out.println(data);
			}*/
			
			//방법2
			int data=-1;
			while((data=is.read())!=-1) {
				System.out.print(data);
			}
			//close 안하면 이파일 사용못함
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}