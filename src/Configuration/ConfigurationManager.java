package Configuration;

import Elements.Element;
import Valiables.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.fail;

public class ConfigurationManager {
    protected static WebDriver driver = null;
    protected String baseUrl = "https://mail.ru/";
    private static StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","D:/java/ST/autotesting/chromedriver.exe");
        driver = new ChromeDriver();
        implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(DataEnum.BASEURL.getValue());
    }

    @After
    public void logout() throws Exception{
//        if (driver.findElement(Locators.LOGOUT).isDisplayed()) {
//            driver.findElement(Locators.LOGOUT).click();
//        }
        driver.close();
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

//    @AfterClass
//    public static void tearDown(){
//        driver.close();
//        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
//    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void implicitlyWait(int value, TimeUnit wait){
        driver.manage().timeouts().implicitlyWait(value, wait);
    }

    public void pageLoadTimeout(int value, TimeUnit wait){
        driver.manage().timeouts().pageLoadTimeout(value, wait);
    }

    public void setScriptTimeout(int value, TimeUnit wait){
        driver.manage().timeouts().setScriptTimeout(value, wait);
    }

}