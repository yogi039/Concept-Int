package org.samsungmobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.samsungproject.BaseClass;

public class Computing extends BaseClass{
public Computing() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "(//span[text()='Computing'])[1]")
private WebElement computing;
@FindBy(xpath = "(//span[text()='Computer Monitors'])[1]")
private WebElement monitors;
public WebElement getComputing() {
	return computing;
}
public WebElement getMonitors() {
	return monitors;
}
public WebElement getSmartmonitor() {
	return smartmonitor;
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
@FindBy(xpath = "(//span[text()='Smart Monitor'])[1]")
private WebElement smartmonitor;
@FindBy(xpath = "(//a[text()='Buy now'])[1]")
private WebElement buy;
@FindBy(xpath = "(//a[text()='ADD TO CART'])[1]")
private WebElement cart;
@FindBy(id = "delivery-zipcode")
private WebElement pincode;
@FindBy(xpath = "//a[text()=' Apply']")
private WebElement apply;
}
