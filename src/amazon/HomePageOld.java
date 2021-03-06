package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageOld {


    public static void main(String[] args) throws InterruptedException {
//  //chromeBrowse
// first we create a variable
        String amazonUrl="https://www.amazon.com/";
        String productName="Mask";
        String searchBoxLocator="twotabsearchtextbox";
        String searchButtonLocator="nav-search-submit-button";

   String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
   System.setProperty("webdriver.chrome.driver",chromeDriverPath);
    WebDriver driver = new ChromeDriver();
    driver.get("amazonUrl");

    driver.manage().window().fullscreen();
    driver.manage().deleteAllCookies();
    driver.findElement(By.id("searchBoxLocator")).sendKeys("productName");
    driver.findElement(By.id("searchButtonLocator")).click();
    //driver.findElement(By.className("")).click();
//    driver.findElement(By.cssSelector("")).click();
//    driver.findElement(By.xpath("")).click();
//    driver.findElement(By.tagName("")).click();
//    driver.findElement(By.linkText("")).click();
//    driver.findElement(By.partialLinkText("")).click();
    Thread.sleep(5000);    // wait purpose
        driver.close();


 //FireFoxBrowser
//       String fireFoxDriverPath="BrowserDriver/windows/geckodriver.exe";
//        //System class is taking two variables one is the key and the other is the value
//       System.setProperty("webdriver.gecko.driver",fireFoxDriverPath);
//      WebDriver driver1= new FirefoxDriver();
//       driver1.get("https://www.amazon.com/");
//        // edgeBrowser
//        String EdgeDriverPath="BrowserDriver/windows/msedgedriver.exe";
//        //System class is taking two variables one is the key and the other is the value
//        String edgeDriverPath;
//        System.setProperty("webdriver.edge.driver",edgeDriverPath);
//        WebDriver driver2= new EdgeDriver();
//        driver2.get("https://www.amazon.com/");


    }
}

