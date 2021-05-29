package io;

import java.io.*;

public class CharCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		FileReader fr=null;
		FileWriter fw=null;
		File fread=null;
		File fwrite=null;
		if(args.length==2)
		{
			fread=new File(args[0]);
			fwrite=new File(args[1]);
		}
		else
		{
			System.out.println("Please use like this: CopyFile <Filename1> <Filename2>");
			System.exit(0);
		}
       try {
		fr = new FileReader(fread);
	    fw = new FileWriter(fwrite);
	    while((ch=fr.read())!=-1)
	    {
	    	fw.write(ch);
	    }
	    fr.close();
	    fw.close();
	    System.out.println("File Copied");
		
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
