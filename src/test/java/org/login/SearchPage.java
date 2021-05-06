package org.login;

import org.base.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Utilities{
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({ @FindBy(id="location"), @FindBy(xpath="//select[@id='location']") })
	private WebElement ddloction;
	@FindAll({@FindBy(id="hotels"),@FindBy(xpath="//select[@id='hotels']")})
	private WebElement ddnHotel;
	@FindAll({@FindBy(name="room_type"),@FindBy(xpath="//select[@id='room_type']")})
	private WebElement ddRoomType;
	@FindAll({@FindBy(name="room_nos"),@FindBy(xpath="//select[@id='room_nos']")})
	private WebElement ddRoomNos;
	@FindAll({@FindBy(id="datepick_in"),@FindBy(xpath="//input[@id='datepick_in']")})
	private WebElement dddatepickin;
	@FindAll({@FindBy(name="datepick_out"),@FindBy(xpath="//input[@name='datepick_out']")})
	private WebElement dddatepickout;
	@FindAll({ @FindBy(name="adult_room"), @FindBy(xpath="(//select[@class='search_combobox'])[5]") })
	private WebElement ddAdultroom;
	@FindAll({@FindBy(id="child_room"),@FindBy(xpath="//select[@id='child_room']")})
	private WebElement ddnChildRoom;
	@FindAll({@FindBy(id="Submit"),@FindBy(xpath="//select[@id='Submit']")})
	private WebElement btnSubmit;
	public WebElement getDdloction() {
		return ddloction;
	}
	public WebElement getDdnHotel() {
		return ddnHotel;
	}
	public WebElement getDdRoomType() {
		return ddRoomType;
	}
	public WebElement getDdRoomNos() {
		return ddRoomNos;
	}
	public WebElement getDddatepickin() {
		return dddatepickin;
	}
	public WebElement getDddatepickout() {
		return dddatepickout;
	}
	public WebElement getDdAdultroom() {
		return ddAdultroom;
	}
	public WebElement getDdnChildRoom() {
		return ddnChildRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}


