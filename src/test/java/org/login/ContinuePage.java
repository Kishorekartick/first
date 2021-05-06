package org.login;

import org.base.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinuePage extends Utilities {
	public ContinuePage() {
		PageFactory.initElements(driver, this);

	}
	@FindAll({@FindBy(id="radiobutton_0"), @FindBy(xpath="//input[@id='radiobutton_0']") })
	private WebElement btnRadio;
	@FindAll({@FindBy(id="continue"),@FindBy(xpath="//input[@id='continue']")})
	private WebElement btnContinue;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
