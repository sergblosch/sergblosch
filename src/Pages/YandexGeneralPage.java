package Pages;
import Configuration.ConfigurationManager;
import Elements.*;
import org.openqa.selenium.By;

public class YandexGeneralPage {

    public TextInput loginField = new TextInput();
    public TextInput passwordField = new TextInput();
    public Button authButton = new Button();

    public YandexGeneralPage fillLoginField(String login){
        loginField.sendKeys(login);
        return this;
    }

    public YandexGeneralPage fillLoginField(By by, String login){
        loginField.sendKeys(by, login);
        return this;
    }

    public YandexGeneralPage fillPasswordField(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public YandexGeneralPage fillPasswordField(By by, String password){
        passwordField.sendKeys(by, password);
        return this;
    }

    public Inbox clickAuth(){
        authButton.click();
        return new Inbox();
    }

    public Inbox clickAuth(By by){
        authButton.click(by);
        return new Inbox();
    }

    public Inbox fillLoginForm(String login, String password){
        return fillLoginField(login).fillPasswordField(password).clickAuth();
    }

    public Inbox fillLoginForm(By byl, String login, By byp, String password){
        return fillLoginField(byl, login).fillPasswordField(byp, password).clickAuth();
    }

    public String getPageTitle(){
        return ConfigurationManager.getDriver().getTitle();
    }

}