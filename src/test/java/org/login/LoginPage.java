package org.login;

import org.base.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utilities {
	 public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="username"),@FindBy(xpath="//input[@id='username']")})
	public WebElement txtUsername;
	@FindAll({@FindBy(id="password"),@FindBy(xpath="//input[@id='password']")})	
	public WebElement txtPassword;
	@FindAll({@FindBy(id="login"),@FindBy(xpath="//input[@id='login']")})	
	public WebElement btnLogin;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	

}

