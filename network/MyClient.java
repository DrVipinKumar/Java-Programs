package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		Socket s=new Socket("127.0.0.1",8888);
		
		if(s!=null)
		{
			
			System.out.println("Connection Stablized....");
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			BufferedReader serverData=new BufferedReader(new InputStreamReader(s.getInputStream()));
			boolean check=true;
			while(check)
			{
			System.out.println("Client>>");
			String data=br.readLine();
			pw.println(data);
			String sevData=serverData.readLine();
			if(sevData.equals("bye"))
			{
				check=false;
			}
			System.out.println("Server>>"+sevData);
			
			}
		}
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
