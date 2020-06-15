package com.designpattern.creational.singleton;

/*Whenever single instance is need, we create singleton design pattern*/
public class SingletonPattern 
{
	private static SingletonPattern instance;
	
	private SingletonPattern() 
	{
	}
	
	public static SingletonPattern getInstance() 
	{
		if(instance != null) 
		{
			return instance;
		}
		instance =  new SingletonPattern(); 
		return instance;
	}
}



