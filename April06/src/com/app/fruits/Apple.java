package com.app.fruits;

public class Apple extends Fruit {
	private String colour="Red";
	private String name="Apple";
	private boolean fresh=true;
	private double weight;

	public Apple(String c, double w,String n,boolean f) {
		super(c, n , f);
		this.weight=w;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFresh(boolean res)
	{
		this.fresh=res;
	}
	
	public String taste() {
		// TODO Auto-generated method stub
	
		return "Sweet And Sour";
	}
	
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return colour;
	}

@Override
	public String toString() {
	// return super.toString() +" Course "  +course +" Marks " +marks +" Fees " + fees
		return "Apple [" + super.toString() +"   weight " +weight + "]";
	}


@Override
public String getName() {
	// TODO Auto-generated method stub
	return name;
}


@Override
public boolean getFresh() {
	// TODO Auto-generated method stub
	return fresh;
}


public void jam() {
	System.out.println(name +" making Jam");
}

	
	

	

	
	
	

}
