package io;

import java.io.*;



public class ReadFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
       // File f =new File("src\\io\\FileInfo.java");
        try {
			FileReader rf =new FileReader("src\\io\\MyFile.txt");
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
