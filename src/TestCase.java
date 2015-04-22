/**
 * Created by bsg on 20.04.2015.
 */
    package com.example.tests;
    import org.junit.*;

    import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.*;
    import org.openqa.selenium.firefox.FirefoxDriver;

    import static org.junit.Assert.fail;

public class TestCase {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "https://e.mail.ru/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testUntitled() throws Exception {
            driver.get(baseUrl + "/login?email=sdg@mail.ru&fail=1&captcha=1");
            driver.findElement(By.name("Password")).clear();
            driver.findElement(By.name("Password")).sendKeys("sdfgds");
            driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
            driver.findElement(By.name("captcha")).clear();
            driver.findElement(By.name("captcha")).sendKeys("zgsd");
            driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }
