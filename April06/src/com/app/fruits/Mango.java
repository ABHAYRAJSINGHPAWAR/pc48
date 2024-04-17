package com.app.fruits;

public class Mango extends Fruit {
	private final String colour="Yellow";
	private final String name="mango";
	private boolean fresh=true;
	private double weight;
	
	
	public Mango(String c, double w,String n,boolean f) {
		super(c,  n ,f);
		this.weight=w;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setFresh(boolean res)
	{
		this.fresh=res;
	}
	
	public String taste()
	{
		return "sweet";
	}

	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return colour;
	}

	
	public double getweight() {
		// TODO Auto-generated method stub
		return weight;
	}
	

	@Override
	public String toString() {
		return "Mango " +"[ " +super.toString()+"   weight " +weight + "]";
	}

	@Override
	public boolean getFresh() {
		// TODO Auto-generated method stub
		return fresh;
	}
	
	public void pulp() {
		System.out.println(name +" "+colour +" Pulpy Fruit ");
	}
	

}
