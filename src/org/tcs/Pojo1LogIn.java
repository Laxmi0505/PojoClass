package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1LogIn extends BaseClass {
	
	public Pojo1LogIn() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	public WebElement getUsername() {
	return username;
	}

	public WebElement getPassword() {
	return password;
	}

	public WebElement getLoginButton() {
	return loginButton;
}
}
