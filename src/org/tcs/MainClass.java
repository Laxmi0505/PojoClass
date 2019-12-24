package org.tcs;

public class MainClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		launchChromeBrowser();
		loadUrl("https://www.adactin.com/HotelApp/");
		
		Pojo1LogIn a=new Pojo1LogIn();
		fill(a.getUsername(), "LakshmiRH");
		fill(a.getPassword(), "Laxmi");
		btnClick(a.getLoginButton());
		
		Pojo2RoomDetails b=new Pojo2RoomDetails();
		selectDetail(b.getLocationName(), "Paris");
		selectDetail(b.getHotelName(), "Hotel Sunshine");
		selectDetail(b.getRoomType(), "Deluxe");
		selectDetail(b.getnRooms(), "1");
		selectDetail(b.getAdultCount(), "2");
		selectDetail(b.getChildCount(), "1");
		btnClick(b.getSubmitButton());
		
		Pojo3Confirmation c=new Pojo3Confirmation();
		btnClick(c.getRadioButton());
		btnClick(c.getContinueButton());
		
		Pojo4Payment d=new Pojo4Payment();
		fill(d.getFirstName(), "Lakshmi");
		fill(d.getLastName(), "Raja");
		fill(d.getBillingAddress(), "Chennai");
		fill(d.getCardNumber(), "1234123456785678");
		selectDetail(d.getCardType(), "OTHR");
		selectDetail(d.getCardExpMon(), "5");
		selectDetail(d.getCardExpYear(), "2022");
		fill(d.getCvvNum(), "109");
		btnClick(d.getBookNowBtn());
		
		Thread.sleep(10000);
		
		Pojo5BookId e=new Pojo5BookId();
		String orderId = orderId(e.getOrderNum());
		System.out.println("The Order Number is:" +orderId);		
	}
}