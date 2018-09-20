package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver webDriver = null;
    @Parameters({"url"})
    @BeforeMethod

    public void loginPage (@Optional("https://www.khanacademy.org/") String url) {


        System.setProperty("webdriver.chrome.driver", "/Users/saleemkhan/IdeaProjects/WebAutomation/Generic/driver/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.khanacademy.org/");


    }
    @AfterMethod

    public void logoutPage () {
       // webDriver.close();
    }


}
