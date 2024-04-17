package com.app.fruits;

public class Orange extends Fruit {
	private String colour="tangerines";
	private String name="Orange";
	private boolean fresh=false;
	private double weight;

	public Orange(String c, double w,String n,boolean f) {
		super(c , n , f);
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
		return "Sour";
	}
	
	
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return colour;
	}

	
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	

	@Override
	public String toString() {
		return "Orange [ " +super.toString() +"   weight "+weight + "]";
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
	
	public void juice() {
		System.out.println(name +" " +weight +" Extracting juice ");
	}

}
