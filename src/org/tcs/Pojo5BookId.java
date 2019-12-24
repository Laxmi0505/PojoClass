package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo5BookId extends BaseClass {
	public Pojo5BookId() {
		PageFactory.initElements(driver, this);
	}

@FindBy(id="order_no")
private WebElement orderNum;

public WebElement getOrderNum() {
	return orderNum;
}
}
