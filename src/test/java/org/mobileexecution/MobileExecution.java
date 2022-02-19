package org.mobileexecution;

import org.samsungmobile.MobilePageLocators;
import org.samsungmobile.TvPageLocators;
import org.samsungproject.BaseClass;
import org.testng.annotations.Test;

public class MobileExecution extends MobilePageLocators{
	

	public static void mobilePage() {
   
	BaseClass.wait(10);
	if(new MobilePageLocators().getCookie().isDisplayed()) {
		BaseClass.press(new MobilePageLocators().getCookie());
	}
	BaseClass.expWait(new MobilePageLocators().getMobile(), 10);
	BaseClass.moveToElement(new MobilePageLocators().getMobile());
	BaseClass.expWait(new MobilePageLocators().getSmartphone(), 10);
	BaseClass.moveToElement(new MobilePageLocators().getSmartphone());	
	BaseClass.press(new MobilePageLocators().getGalaxyz());
	BaseClass.press(new MobilePageLocators().getBuynow());
	try {
		if(new MobilePageLocators().getCont1().isEnabled()) {
			BaseClass.press(new MobilePageLocators().getCont1());
		}
	} catch (Exception e) {
		e.printStackTrace();
//		System.err.println();
		// TODO: handle exception
	}
	
	BaseClass.expWait(new MobilePageLocators().getCont1(), 10);
	BaseClass.press(new MobilePageLocators().getCont1());
	BaseClass.expWait(new MobilePageLocators().getCont2(), 20);
	BaseClass.press(new MobilePageLocators().getCont2());
if(new MobilePageLocators().getDontallow().isDisplayed()) {
	BaseClass.press(new MobilePageLocators().getDontallow());
}
	BaseClass.check(new MobilePageLocators().getDontallow());

}
}
