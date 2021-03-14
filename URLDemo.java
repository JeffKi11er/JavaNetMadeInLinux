package url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
	public static void main(String []args) {
		try {
			URL url = new URL("https://www.facebook.com/");
			System.out.print(url.getProtocol()+"\n");
			System.out.print(url.getHost()+"\n");
			System.out.print(url.getFile()+"\n");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
