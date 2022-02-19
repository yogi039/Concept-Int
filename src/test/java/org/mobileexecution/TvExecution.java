package org.mobileexecution;

import org.samsungmobile.MobilePageLocators;
import org.samsungmobile.TvPageLocators;
import org.samsungproject.BaseClass;

public class TvExecution extends MobileExecution {
public static void tvPage() {
	BaseClass.wait(10);
	BaseClass.expWait(new TvPageLocators().getTv(), 10);
	BaseClass.moveToElement(new TvPageLocators().getTv());
	BaseClass.expWait(new TvPageLocators().getTvtype(), 10);
	BaseClass.moveToElement(new TvPageLocators().getTvtype());	
	BaseClass.press(new TvPageLocators().getCrystaltv());
	BaseClass.press(new TvPageLocators().getBuy());
	
	BaseClass.data(new TvPageLocators().getPincode(), "600001");
	BaseClass.press(new TvPageLocators().getApply());
	BaseClass.expWait(new TvPageLocators().getCart(), 10);
	BaseClass.press(new TvPageLocators().getCart());
	BaseClass.press(new TvPageLocators().getreturntocart());
}
}
