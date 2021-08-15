package com.designpattern.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

//Prototype pattern is clone an object.
//If one object is loading a data from db or rest api. and you want to need of same another object. then no need to load the data from db or api.
//Instead use the prototye pattern to clone the object.
// We have 2 types of cloning, shallow cloning and deep cloning.
class Vehicle implements Cloneable
{
	private List<String> vechicleList;
	
	public Vehicle()
	{
		this.vechicleList = new ArrayList<String>();
	}
	
	public Vehicle(List<String> list)
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

	//Shallow copying. it won't create new object. one object is created and it 2 reference created.If we change in one object. it will affect in others as well.
	/*public Object clone() throws CloneNotSupportedException {
		super.clone();
	}*/

	//It is deep cloning.Here we're using 'this' keyword to get the data from current object and return the newly created object.
	public Object clone() {
		
		List<String> tempList = new ArrayList<String>();
		
		for(String s: this.vechicleList) 
		{
			tempList.add(s);
		}
		return new Vehicle(tempList);
	}

	public List<String> getVechicleList() {
		return vechicleList;
	}
}

public class PrototypePattern {

	public static void main(String[] args)
	{
		Vehicle a = new Vehicle();
		a.insertData();
		
		//clone
		Vehicle b = (Vehicle)a.clone();
		
		List<String> list = b.getVechicleList();
		list.add("Prakash");
		
		System.out.println(a.getVechicleList());
		System.out.println(list);
		
		b.getVechicleList().remove("Aadi");
		System.out.println(list);
	}
}
