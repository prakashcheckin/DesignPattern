package com.designpattern.creational.builderpattern;

/*Builderpattern is needed when object has mutilple variable. 
It is very difficult to create an object, if all the value loaded in consturtor. 
Because of we pass the value in wrong order then object created incorrectly.
If we use setter to set value for an object then this may cause issue in multi threading.*/

public class Meals
{
	private String type;
	private String rice;
	private String biryani;
	private String sideDish;
	private String sweet;
	private boolean curd;
		
	private Meals(MealsBuilder builder) 
	{
		this.type = builder.type;
		this.rice = builder.rice;
		this.biryani = builder.biryani;
		this.sideDish = builder.sideDish;
		this.sweet = builder.sweet;
		this.curd = builder.curd;
	}
		
		@Override
	public String toString() {
			return "Meals [type=" + type + ", rice=" + rice + ", biryani=" + biryani + ", sideDish=" + sideDish
					+ ", sweet=" + sweet + ", curd=" + curd + "]";
	}


		// Builder class
		public static class MealsBuilder
		{
			private String type;
			private String rice;
			private String biryani;
			private String sideDish;
			private String sweet;
			private boolean curd;
			
			
			public MealsBuilder(String type) 
			{
				this.type = type;
			}
			
			public MealsBuilder rice(String rice) 
			{
				this.rice = rice;
				return this;
			}
			
			public MealsBuilder biryani(String biryani) 
			{
				this.biryani = biryani;
				return this;
			}
			
			public MealsBuilder sideDish(String sideDish) 
			{
				this.sideDish = sideDish;
				return this;
			}
			
			public MealsBuilder sweet(String sweet) 
			{
				this.sweet = sweet;
				return this;
			}
			
			public MealsBuilder curd(boolean curd) 
			{
				this.curd = curd;
				return this;
			}
			
			public Meals build() 
			{
				return new Meals(this);
			}
			
		}
}
	
