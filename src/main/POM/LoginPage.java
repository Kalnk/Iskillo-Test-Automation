package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends iSkilloBase{

    //url
    public static final String LOGIN_PAGE_URL = "http://training.skillo-bg.com:4200/users/login";

    //UI elements
    @FindBy(xpath = "//p[@class=\"h4 mb-4\"]")
    private WebElement loginFormSignInHeader;
    @FindBy(xpath = "//input[@id='defaultLoginFormUsername']")
    private WebElement usernameInputField;
    @FindBy(xpath = "//input[@id='defaultLoginFormPassword']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//input[contains(@formcontrolname,'rememberMe')]")
    private WebElement rememberMeCheckbox;
    @FindBy (xpath = "//span[contains(text(),'Remember me')]")
    private WebElement rememberMeLabelText;
    @FindBy (css = "#sign-in-button")
    private WebElement loginFormSignInButton;
    @FindBy (xpath = "//span[contains(text(),'Not a member?')]")
    private WebElement notLogdedInDescriptionText;
    @FindBy (xpath = "//span[contains(text(),'Not a member? ')]")
    private WebElement registerButton;


}
