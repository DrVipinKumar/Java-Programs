package network;
import java.io.*;
import java.net.*;
public class NewClient {

	
	public static void main (String args[])
	{
	try
	{
	Socket s = new Socket (InetAddress.getLocalHost(), 9999);
	if (s != null)
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	InputStream is = s.getInputStream();
	BufferedReader br1 = new BufferedReader (new InputStreamReader(is));
	OutputStream os = s.getOutputStream();
	PrintWriter pw = new PrintWriter(os, true);
	boolean more = true;
	while (more) {
	String str1 = br.readLine();
	if(str1.equals("bye"))
	more = false;
	pw.println(str1);
	String str2 = br1.readLine();
	System.out.println("Server:"+str2);
	} // while ends
	} // if ends
	} catch (UnknownHostException uhe)
	{
		System.out.println(uhe);
	}
	catch ( IOException ioe)
	{
		System.out.println(ioe);
	}
	} // main closed
	} // client closed



