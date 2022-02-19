package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleClass3 extends SampleClass1 {
	@BeforeClass
	public void beforeClass() {
		System.out.println(" before class");
	}
		@Test(priority = 2 )
	public void testdata2() {
		System.out.println(" test2");
}
}
