package com.thread;

public class MyThread extends Thread{

	//CTOR
	public MyThread( String name) {
		super(name);
	
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(getName() +" exec " +i);
				sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() +" Give exc " +e);		
			}
		System.out.println(getName() + " over ");
		
	}
	
}
