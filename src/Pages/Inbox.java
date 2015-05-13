package Pages;

import Elements.Element;
import Valiables.LocatorsYandexGeneralPage;
import Valiables.LocatorsYandexIncomingPage;
import org.openqa.selenium.By;


public class Inbox{

    Element link = new Element();

    public boolean isAvatarPresent(){
        link.elements(LocatorsYandexGeneralPage.LETTER_LINK).get(0).click();
        return link.element(LocatorsYandexGeneralPage.AVATAR).isDisplayed();
    }

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