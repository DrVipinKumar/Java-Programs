package network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebContent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line=null;
		try {
				URL myweb = new URL("https://in.yahoo.com/?p=us&guccounter=1");
				FileWriter file=new FileWriter("youtube.html");
				InputStreamReader input = new InputStreamReader(myweb.openStream());
				BufferedReader data=new BufferedReader(input);
				while((line=data.readLine())!=null)
				{
					System.out.println(line);
					file.write(line);
				}
				file.close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
