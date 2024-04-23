package com.tester;

import com.thread.MyThread;

public class Tester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        MyThread t1=new MyThread("One");
        MyThread t2=new MyThread("Two");
        MyThread t3=new MyThread("three");
        MyThread t4=new MyThread("Four");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" " +i);
			Thread.sleep(1000);
		}
        
        System.out.println(Thread.currentThread().getName() +" terminated " );
	}

}
