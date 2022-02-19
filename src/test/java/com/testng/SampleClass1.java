package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClass1 {
	@AfterClass
	public void afteClass() {
		System.out.println(" After class");
	}
	@Test(priority = 1 )
	public void testdata1() {
		System.out.println(" test1");
	}
	@BeforeMethod
	public void testdat() {
		System.out.println("Before method");
}
}

