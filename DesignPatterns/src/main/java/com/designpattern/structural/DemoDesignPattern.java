package com.designpattern.structural;

import com.designpattern.structural.proxypattern.Internet;
import com.designpattern.structural.proxypattern.ProxyInternet;

public class DemoDesignPattern 
{

	public static void main (String[] args) 
    { 
        Internet internet = new ProxyInternet(); 
        try
        { 
            internet.connectTo("geeksforgeeks.org"); 
            internet.connectTo("xnxx.com"); 
            internet.connectTo("xxx.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 

}
