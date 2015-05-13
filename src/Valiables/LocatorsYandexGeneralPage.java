package Valiables;

import org.openqa.selenium.By;

public interface LocatorsYandexGeneralPage {

//    By LOGIN = By.id("mailbox__login");
//    By PASSWORD = By.id("mailbox__password");
//    By AUTH_BUTTON = By.id("mailbox__auth__button");

    By LOGIN = By.xpath("//input[contains(@name, 'login')]");
    By PASSWORD = By.xpath("//input[contains(@name, 'passwd')]");

    By AUTH_BUTTON = By.xpath("//button[contains(@class, 'button auth__login-button button_size_s button_theme_normal i-bem button_js_inited')]");
    By SIGN_LINK = By.xpath("//button[contains(@class, 'button user__enter button_pseudo_yes button_size_m button_theme_pseudo i-bem button_js_inited')]");

    By LETTER_LINK = By.cssSelector(".js-href.b-datalist__item__link");
    By AVATAR = By.cssSelector(".b-letter__head__avatar.js-contact-informer");

    //By INCOMING = By.xpath("//div[contains(@class, 'b-nav__ico')]");
    By ERROR = By.xpath("//div[contains(@class, 'login-page__external_error login-page__external__text_indent js-login-page__external__info')]");

}
