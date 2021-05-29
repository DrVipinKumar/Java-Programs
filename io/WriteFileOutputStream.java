package io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data= "This is my file data";
		char ch;
		try {
			FileOutputStream fw = new FileOutputStream("src\\io\\MyFile.txt");
			char mydata[]=data.toCharArray();
			for(int i=0;i<mydata.length;i++)
			{
			fw.write((byte)mydata[i]);
			}
			System.out.println("Data written");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
