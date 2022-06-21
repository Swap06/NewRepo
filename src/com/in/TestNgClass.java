package com.in;

import org.testng.annotations.Test;

public class TestNgClass {

	
	@Test
	public void m1()
{
	System.out.println("m1");	
}
	
	@Test(priority = 10 , enabled = false)
     public void m2() {
		System.out.println("m2");
	}
	
	
	@Test(priority = 5 , enabled = true)
    public void m3() {
		System.out.println("m3");
	}
	
	@Test(dependsOnMethods = {"m3","m1"})
    public void m4() {
		System.out.println("m4");
	}
}
