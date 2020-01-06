package com.designpattern.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.designpattern.creational.singleton.SingletonPattern;

public class SingletonPatternTest {
	
	@Test
	public void getInstanceTest() 
	{
		SingletonPattern instance1 = SingletonPattern.getInstance();
		SingletonPattern instance2 = SingletonPattern.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		assertEquals(instance1, instance2);
	}

}
