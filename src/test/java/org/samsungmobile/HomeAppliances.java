package org.samsungmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samsungproject.BaseClass;

public class HomeAppliances extends BaseClass {
	public HomeAppliances() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath = "(//span[text()='Home Appliances'])[1]")
		private WebElement homeapp;
		@FindBy(xpath = "(//span[text()='Refrigerators'])[1]")
		private WebElement ref;
		@FindBy(xpath = "(//span[text()='French Door'])[1]")
		private WebElement frenchdoor;
		@FindBy(xpath = "(//a[text()='Buy now'])[1]")
		private WebElement buy;
		@FindBy(xpath = "(//a[text()='ADD TO CART'])[1]")
		private WebElement cart;
		@FindBy(id = "delivery-zipcode")
		private WebElement pincode;
		@FindBy(xpath = "//a[text()=' Apply']")
		private WebElement apply;
		public WebElement getHomeapp() {
			return homeapp;
		}
		public WebElement getRef() {
			return ref;
		}
		public WebElement getFrenchdoor() {
			return frenchdoor;
		}
		public WebElement getBuy() {
			return buy;
		}
		public WebElement getCart() {
			return cart;
		}
		public WebElement getPincode() {
			return pincode;
		}
		public WebElement getApply() {
			return apply;
		}
		
}
