package Testing;
import Configuration.ConfigurationManager;
import Pages.*;
import Valiables.Data;
import Valiables.DataEnum;
import Valiables.LocatorsYandexGeneralPage;
import Valiables.LocatorsYandexIncomingPage;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RunTesting extends ConfigurationManager {

    @Test
     public void testCorrectCredentials() throws Exception {
        //preparation
        Data data = new Data();
        YandexGeneralPage loginPage = new YandexGeneralPage();
        //new Button(Locators.SIGN_LINK).click();
        //test
        Inbox inboxPage = loginPage.
                fillLoginField(LocatorsYandexGeneralPage.LOGIN, DataEnum.LOGIN.getValue()).
                fillPasswordField(LocatorsYandexGeneralPage.PASSWORD, DataEnum.PASSWORD.getValue()).
                clickAuth(LocatorsYandexGeneralPage.AUTH_BUTTON);
        assertTrue("There is no INCOMING locator on the page", inboxPage.isElementPeresent(LocatorsYandexIncomingPage.INCOMING));
    }

//    @Test
//    public void testWrongCredentials() throws Exception {
//        //preparation
//        Data data = new Data();
//        LoginPage loginPage = new LoginPage();
//        //test
//        Inbox inbox = loginPage.fillLoginForm("qw", "qw");
//        assertTrue("There is no ERROR locator on the page", inbox.isElementPeresent(Locators.ERROR));
//    }

}