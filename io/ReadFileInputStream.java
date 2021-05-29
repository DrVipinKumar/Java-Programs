package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
	       
	        try {
				FileInputStream rf =new FileInputStream("src\\io\\MyFile.txt");
				while((ch=rf.read())!=-1)
					{
						System.out.print((char)ch);					
					}
				
				
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
