package com.first.packag;

import org.testng.annotations.Test;

public class firstclassinfisrtpack {
	@Test(timeOut=3000)
	public void firstclassinfisrtpack() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("this is firstclassinfisrtpack");
	}
	
	@Test(timeOut=2000)

	public void secondclasssefirstpack() throws InterruptedException
	
	{
		Thread.sleep(3000);
		System.out.println("this is secondclasssefirstpack");
	}
	
	
}
