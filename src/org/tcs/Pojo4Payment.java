package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4Payment extends BaseClass{
	public Pojo4Payment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement cardNumber;

	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement cardExpMon;
	
	@FindBy(id="cc_exp_year")
	private WebElement cardExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement bookNowBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardExpMon() {
		return cardExpMon;
	}

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
}
