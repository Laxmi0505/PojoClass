package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2RoomDetails extends BaseClass {

	public Pojo2RoomDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement locationName;
	
	@FindBy(id="hotels")
	private WebElement hotelName;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement nRooms;
	
	@FindBy(id="adult_room")
	private WebElement adultCount;
	
	@FindBy(id="child_room")
	private WebElement childCount;
	
	@FindBy(id="Submit")
	private WebElement submitButton;

	public WebElement getLocationName() {
		return locationName;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getnRooms() {
		return nRooms;
	}

	public WebElement getAdultCount() {
		return adultCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
}
