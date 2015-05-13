package Elements;

import Configuration.ConfigurationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Element {

    protected By by;

    public Element(){
    }

    public Element(By by){
        this.by = by;
    }

    public WebElement element(){
        return ConfigurationManager.getDriver().findElement(by);
    }

    public WebElement element(By by){
        return ConfigurationManager.getDriver().findElement(by);
    }

    public List<WebElement> elements(){
        return ConfigurationManager.getDriver().findElements(by);
    }

    public List<WebElement> elements(By by){
        return ConfigurationManager.getDriver().findElements(by);
    }

}