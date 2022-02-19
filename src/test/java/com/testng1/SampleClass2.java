package com.testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testng.SampleClass1;

public class SampleClass2 extends SampleClass1 {
	@BeforeClass
public void beforeClass() {
	System.out.println("From Sam 2 before class");
}
	@Test(priority = 1 )
public void testdata() {
	System.out.println("From Sam 2 test");
}
}
