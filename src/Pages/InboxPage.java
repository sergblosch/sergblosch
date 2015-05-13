package Pages;

import Elements.Element;
import Valiables.LocatorsYandexGeneralPage;
import Valiables.LocatorsYandexIncomingPage;
import org.openqa.selenium.By;


public class InboxPage {

    Element link = new Element();

    public boolean isIncommingPresent(){
        return link.element(LocatorsYandexIncomingPage.INCOMING).isDisplayed();
    }

    public boolean isElementPresent(){
        return link.element().isDisplayed();
    }

    public boolean isElementPeresent(By by){
        return link.element(by).isDisplayed();
    }

}