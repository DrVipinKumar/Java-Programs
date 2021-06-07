package network;
import java.net.*;
import java.io.*;
public class NewServer {
	public static void main (String args[])
	{
	try
	{
	ServerSocket ss = new ServerSocket(9999);
	Socket s = ss.accept();
	if( s != null)
	{
	InputStream is = s.getInputStream();
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(isr);
	OutputStream os = s.getOutputStream();
	PrintWriter pw = new PrintWriter(os, true);
	boolean more = true;
	while (more)
	{
	String str = br.readLine();
	if(str.equals("bye"))
	more = false;
	System.out.println("Client:"+str);
	pw.println(str);
	} // while closed
	} // if closed
	}catch (UnknownHostException uhe)
	{
		System.out.println(uhe);
	}
	catch ( IOException ioe)
	{
		System.out.println(ioe);
	}
	} // main closed
	} // server closed


