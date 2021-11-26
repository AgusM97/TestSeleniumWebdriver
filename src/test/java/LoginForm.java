import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginForm extends PageObject{

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String INVALID_USERNAME = "invalidu";
    private final String INVALID_PASSWORD = "invalidp";
    private final String INVALID_LOGIN_ERROR = "Epic sadface: Username and password do not match any user in this service";

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login_button;

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(){
        username.sendKeys(USERNAME);
    }

    public void enterPassword(){
        password.sendKeys(PASSWORD);
    }

    public void enterInvalidUsername(){
        username.sendKeys(INVALID_USERNAME);
    }

    public void enterInvalidPassword(){
        password.sendKeys(INVALID_PASSWORD);
    }

    public void pressLoginButton(){
        login_button.click();
    }

    public boolean checkInvalidLogin(){
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + INVALID_LOGIN_ERROR + "')]"));
        return list.size() > 0;
    }

    public boolean checkForLoginContainer(){
        List<WebElement> list = driver.findElements(By.id("login_button_container"));
        return list.size() > 0;
    }
}
