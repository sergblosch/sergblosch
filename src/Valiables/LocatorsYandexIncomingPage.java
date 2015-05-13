package Valiables;

import org.openqa.selenium.By;

public interface LocatorsYandexIncomingPage {
    By INCOMING = By.xpath("//a[contains(@data-params, 'current_folder=2470000450074133333')]");
    By LOGOUT = By.id("PH_logoutLink");
}
