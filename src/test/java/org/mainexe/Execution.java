package org.mainexe;

import org.junit.Assert;
import org.mobileexecution.ComputingExecution;
import org.mobileexecution.TvExecution;
import org.samsungproject.BaseClass;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Execution extends ComputingExecution {
	@Test
public static void exe() {
		BaseClass.url("https://www.samsung.com/in/");
		mobilePage();
		tvPage();
		homeApp();
		computerPage();
	
}
}
