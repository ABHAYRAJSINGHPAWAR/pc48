package com.app.fruits;

public abstract class Fruit {
	private String colour;
	private String name;
	private boolean fresh;
	private double weight;
	
	public Fruit(String c,String n,boolean f){
		this.colour=c;
		this.name=n;
		this.fresh=f;
		
	}
	
	public abstract String getColour();
	public abstract String getName();
	public abstract boolean getFresh();
	
	
	public String taste() {
		return "No Specific Taste";
	}

	@Override
	public String toString() {
		return " colour= " + colour + "   name= " +name +"   fresh= " + fresh ;
	}

	public abstract void setFresh(boolean b);
	
}
