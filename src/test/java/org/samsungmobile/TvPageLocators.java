package org.samsungmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samsungproject.BaseClass;

public class TvPageLocators extends BaseClass{
	public TvPageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[text()='TV & AV'])[1]")
	private WebElement tv;
	@FindBy(xpath = "(//span[text()='TVs'])[1]")
	private WebElement tvtype;
	@FindBy(xpath = "(//span[text()='Crystal UHD'])[1]")
	private WebElement crystaltv;
	@FindBy(xpath = "(//a[text()='Buy now'])[1]")
	private WebElement buy;
	@FindBy(xpath = "(//a[text()='ADD TO CART'])[1]")
	private WebElement cart;
	@FindBy(id = "delivery-zipcode")
	private WebElement pincode;
	@FindBy(xpath = "//a[text()=' Apply']")
	private WebElement apply;
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getApply() {
		return apply;
	}
	public WebElement getTv() {
		return tv;
	}
	public WebElement getTvtype() {
		return tvtype;
	}
	public WebElement getCrystaltv() {
		return crystaltv;
	}
	public WebElement getBuy() {
		return buy;
	}
	public WebElement getCart() {
		return cart;
	}
	@FindBy(id = "primaryInfoGoCart")
	private WebElement returntocart;
	
	public WebElement getreturntocart() {
		return returntocart;
		
	}
}
