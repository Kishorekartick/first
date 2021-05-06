package org.test;


import org.base.Utilities;
import org.login.BookingPage;
import org.login.ContinuePage;
import org.login.LoginPage;
import org.login.SearchPage;

public class Prac1 extends Utilities{
	public static void main(String[] args) {

getDriver();
launchUrl("http://adactinhotelapp.com/");
maximize();
LoginPage login = new LoginPage();
enterText(login.getTxtUsername(), "karthi007");
enterText(login.getTxtPassword(), "Karthi@1989");
btnClick(login.getBtnLogin());
SearchPage search = new SearchPage();
selectByVisibleText(search.getDdloction(),"London");
selectByVisibleText(search.getDdnHotel(), "Hotel Creek");
selectByValue(search.getDdRoomType(), "Super Deluxe");
selectByVisibleText(search.getDdRoomNos(),"1 - One");
enterText(search.getDddatepickin(),"24/04/2021");
enterText(search.getDddatepickout(), "25/04/2021");
selectByVisibleText(search.getDdAdultroom(), "2 - Two");
selectByVisibleText(search.getDdnChildRoom(), "0 - None");
btnClick(search.getBtnSubmit());
ContinuePage cp = new ContinuePage();
btnClick(cp.getBtnRadio());
btnClick(cp.getBtnContinue());
BookingPage  bp = new BookingPage();
enterText(bp.getFirstName(), "kishore");
enterText(bp.getLastName(), "kumar");
enterText(bp.getAddress(), "104/h2 dubai main road, dubai-600049");
enterText(bp.getCrdCard(), "198397365653550301");
selectByVisibleText(bp.getCrdCardType(), "VISA");
selectByVisibleText(bp.getExpiryMonth(), "March");
selectByVisibleText(bp.getExpiryYear(), "2022");
enterText(bp.getCrdCvv(), "334");
btnClick(bp.getBookNow());




	}

}
