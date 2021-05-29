package io;

import java.io.File;


public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File directoryPath = new File("D:\\MY DATA\\Projects\\MyJava\\JavaOOPS\\MCA_2_C\\MCA2C\\src\\io");
	      //List of all files and directories
	      File filesList[] = directoryPath.listFiles();
	      System.out.println("List of files and directories in the specified directory:");
	      for(File file : filesList) {
	         System.out.println("File name: "+file.getName());
	         String path=file.getAbsolutePath();
	         System.out.println("File path: "+path);
	         System.out.println("Extentsion:"+path.substring(path.lastIndexOf('.')+1));
	         System.out.println("Size :"+file.getTotalSpace());
	         System.out.println(" ");
	         System.out.println("Size :"+file.getTotalSpace());
	}
	}
}
	
