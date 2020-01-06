package com.designpattern.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

class Vechicle implements Cloneable
{
	private List<String> vechicleList;
	
	public Vechicle() 
	{
		this.vechicleList = new ArrayList<String>();
	}
	
	public Vechicle(List<String> list) 
	{
		this.vechicleList = list;
	}
	
	public void insertData() 
	{
		vechicleList.add("Honda");
		vechicleList.add("Toyoto");
		vechicleList.add("Hyndai");
		vechicleList.add("Aadi");
		vechicleList.add("BMW");
	}
	
	public Object clone() {
		
		List<String> tempList = new ArrayList<String>();
		
		for(String s: this.vechicleList) 
		{
			tempList.add(s);
		}
		return new Vechicle(tempList);
	}

	public List<String> getVechicleList() {
		return vechicleList;
	}
}

public class PrototypePattern {

	public static void main(String[] args)
	{
		Vechicle a = new Vechicle();
		a.insertData();
		
		//clone
		Vechicle b = (Vechicle)a.clone();
		
		List<String> list = b.getVechicleList();
		list.add("Prakash");
		
		System.out.println(a.getVechicleList());
		System.out.println(list);
		
		b.getVechicleList().remove("Aadi");
		System.out.println(list);
	}
}
