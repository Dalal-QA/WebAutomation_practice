package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";
    String productName = "Mask";
    String searchBoxLocator = "twotabsearchtextbox";
    String searchBottonLocator = "nav-search-submit-button";

    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();

//        driver.manage().window().fullscreen();
//        driver.manage().deleteAllCookies();
    }

    @Test
    public void checkSearchBox() {
        driver.get("amazonUrl");
        //enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        //click on searchButton
        driver.findElement(By.id(searchBottonLocator)).click();
    }
@AfterMethod
    public void tearDown(){
        //driver.close();
        driver.quit();
}

}
