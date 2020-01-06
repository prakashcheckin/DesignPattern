package com.designpattern.structural.proxypattern;



public class RealInternet implements Internet{

	/*
	 * This classs is more secured.This class won't be call by client directly. This
	 * method is called only by proxyInternet method. If and only if it serverhost
	 * is valid
	 */
	public void connectTo(String serverhost) throws Exception 
	{
		System.out.println("Connecting to "+ serverhost);
	}

}
