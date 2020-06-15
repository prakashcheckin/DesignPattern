package com.designpattern.structural.proxypattern;

import java.util.HashSet;
import java.util.Set;

/*Proxy design pattern is kind of filterring the request*/

public class ProxyInternet implements Internet
{
	private Internet realInternet = new RealInternet();
	
	private static Set<String> blacklist;
	
	static
	{
		blacklist = new HashSet<String>();
		blacklist.add("xnxx.com");
		blacklist.add("xxx.com");
		blacklist.add("xvideos.com");
	}
	
	public boolean isValidServer(String serverhost) 
	{
		if(blacklist.contains(serverhost)) 
		{
			return true;
		}
		return false;
	}
	
	public void connectTo(String serverhost)
	{
		try 
		{
			if(isValidServer(serverhost))
				throw new Exception(serverhost);
			else
				realInternet.connectTo(serverhost);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage() +" Site is blacklisted");
		}
	}
}
