package org.mobileexecution;

import org.samsungmobile.Computing;
import org.samsungmobile.HomeAppliances;
import org.samsungproject.BaseClass;

public class ComputingExecution extends HomeAppliancesExecution {
public static void computerPage() {
	BaseClass.wait(10);
// 	BaseClass.expWait(new Computing().getComputing(), 10);
	BaseClass.moveToElement(new Computing().getComputing());
	BaseClass.expWait(new Computing().getMonitors(), 10);
	BaseClass.moveToElement(new Computing().getMonitors());	
	BaseClass.press(new Computing().getSmartmonitor());
	BaseClass.press(new Computing().getBuy());
	
	BaseClass.data(new Computing().getPincode(), "600001");
	BaseClass.press(new Computing().getApply());
	BaseClass.expWait(new Computing().getCart(), 10);
	BaseClass.press(new Computing().getCart());
}
}
