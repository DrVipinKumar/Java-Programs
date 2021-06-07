package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress localip,googleip[];
		try {
			localip = InetAddress.getLocalHost();
			System.out.println(localip);
			googleip = InetAddress.getAllByName("tech.kiet.edu");
			for(int i=0;i<googleip.length;i++)
			{
			System.out.println(googleip[i]);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
