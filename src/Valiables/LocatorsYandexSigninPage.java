package Valiables;

import org.openqa.selenium.By;

public interface LocatorsYandexSigninPage {

    By LOGIN = By.xpath("//input[contains(@name, 'login')]");
    By PASSWORD = By.xpath("//input[contains(@name, 'passwd')]");
    By AUTH_BUTTON = By.xpath("//button[contains(@class, ' nb-button _nb-action-button nb-group-start')]");
}
