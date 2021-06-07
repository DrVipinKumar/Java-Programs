package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			ServerSocket ss =new ServerSocket(8888);
			System.out.println("Waiting for connection....");
			Socket s =ss.accept();
			
			if(s!=null)
			{
				System.out.println("Connection accepted....");
				BufferedReader clientInput=new BufferedReader(new InputStreamReader(s.getInputStream()));
				PrintWriter pw =new PrintWriter(s.getOutputStream(),true);
				boolean check=true;
				while(check)
				{
				String data=clientInput.readLine();
				if(data.equals("bye"))
					{
					check=false;
					}
				System.out.println("Client<<"+data);
				pw.println(data);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
