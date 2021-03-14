package inetaddress;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static String getDomainName(String url) throws URISyntaxException{
		URI uri = new URI(url);
		String domain = uri.getHost();
		return domain.startsWith("www.") ? domain.substring(4) : domain;
	}
	public static void main(String []args) throws UnknownHostException{
		InetAddress address = InetAddress.getByName("www.facebook.com");
		System.out.print(address.getHostAddress());
		/***More***/
		//print the IP Address of your machine(inside local network)
		System.out.println(InetAddress.getLocalHost().getHostAddress());
		//print all the IP Address that assign to a certain domain
		InetAddress[] inetAddresses = InetAddress.getAllByName("www.facebook.com");
		for (InetAddress ipAddress : inetAddresses) {
			System.out.println(ipAddress);
		}
	
	}
	

	
}
