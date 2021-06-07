package network;

import java.net.URL;

public class FetchURLInfo {

	public static void main(String[] args) throws Exception {
	        //URL aURL = new URL("http://java.sun.com:80/docs/books/tutorial"
	                          // + "/index.html?name=networking#DOWNLOADING");
	        URL aURL = new URL("https://www.kiet.edu:443");
	        System.out.println("protocol = " + aURL.getProtocol());
		System.out.println("authority = " + aURL.getAuthority());
	        System.out.println("host = " + aURL.getHost());
	        System.out.println("port = " + aURL.getPort());
	        System.out.println("path = " + aURL.getPath());
	        System.out.println("query = " + aURL.getQuery());
	        System.out.println("filename = " + aURL.getFile());
	        System.out.println("ref = " + aURL.getRef());
	    }
	}



