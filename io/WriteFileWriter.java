package io;

import java.io.*;

public class WriteFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data= "This is my file data";
		try {
			FileWriter fw = new FileWriter("src\\io\\MyFile.txt",true);
			fw.write(data);
			System.out.println("Data written");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
