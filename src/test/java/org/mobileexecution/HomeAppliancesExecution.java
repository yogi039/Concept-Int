package org.mobileexecution;

import org.samsungmobile.HomeAppliances;
import org.samsungmobile.TvPageLocators;
import org.samsungproject.BaseClass;

public class HomeAppliancesExecution extends TvExecution{
	public static void homeApp() {
		BaseClass.wait(10);
     	BaseClass.expWait(new HomeAppliances().getHomeapp(), 10);
		BaseClass.moveToElement(new HomeAppliances().getHomeapp());
		BaseClass.expWait(new HomeAppliances().getRef(), 10);
		BaseClass.moveToElement(new HomeAppliances().getRef());	
		BaseClass.press(new HomeAppliances().getFrenchdoor());
		BaseClass.press(new HomeAppliances().getBuy());
		
		BaseClass.data(new HomeAppliances().getPincode(), "600001");
		BaseClass.press(new HomeAppliances().getApply());
		BaseClass.expWait(new HomeAppliances().getCart(), 10);
		BaseClass.press(new HomeAppliances().getCart());
		
	}

}
