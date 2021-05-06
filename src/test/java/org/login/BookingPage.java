package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends org.base.Utilities {

	public BookingPage() {
		PageFactory.initElements(driver, this);
		}

	@FindAll({@FindBy(id="first_name"),@FindBy(xpath="(//input[@class='reg_input'])[1]")})
    private WebElement firstName;
	
	@FindAll({ @FindBy(id="last_name"), @FindBy(xpath="((//input[@class='reg_input'])[2]") })
	private WebElement lastName;
	
	@FindAll({ @FindBy(id="address"), @FindBy(xpath="//textarea[@class='txtarea']") })
	private WebElement address;
	
	@FindAll({ @FindBy(id="cc_num"), @FindBy(xpath="(//input[@class='reg_input'])[3]") })
	private WebElement crdCard;
	
	
	@FindAll({@FindBy(id="cc_type"),@FindBy(xpath="//select[@id='cc_type']")})
	private WebElement crdCardType;
	

	@FindAll({@FindBy(id="cc_exp_month"),@FindBy(xpath="//select[@id='cc_exp_month']")})
	private WebElement expiryMonth;
	
	@FindAll({@FindBy(id="cc_exp_year"),@FindBy(xpath="//select[@id='cc_exp_year']")})
	private WebElement expiryYear;
	
	@FindAll({ @FindBy(id="cc_cvv"), @FindBy(xpath="(//input[@class='reg_input'])[4]") })
	private WebElement crdCvv;
	
	@FindAll({ @FindBy(id="book_now"), @FindBy(xpath="//input[@id='book_now']")})
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCrdCard() {
		return crdCard;
	}

	public WebElement getCrdCardType() {
		return crdCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCrdCvv() {
		return crdCvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}


	}



