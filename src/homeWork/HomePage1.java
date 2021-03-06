package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomePage1 {

//        WebDriver driver;
//        String amazonUrl="https://www.amazon.com/";
//        String productName="Mask";
//        String searchBoxLocator="twotabsearchtextbox";
//        String searchButtonLocator="nav-search-submit-button";
//
////    driver.manage().window().maximize();
////    driver.manage().deleteAllCookies();
//
//        @BeforeMethod
//        public void setUp(){
//            String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
//            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//            driver.get(amazonUrl);
//        }
//
//
//
//        // Action Method
//        public void checkSearchBox(){
//            // Enter product name
//            driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
//            // click on searchButton
//            driver.findElement(By.id(searchButtonLocator)).click();
//
//
//        }
//
//        @AfterMethod
//        public void tearDown(){
//            // driver.close();
//            driver.quit();
//        }




    WebDriver driver;
    String amazonUrl="https://www.amazon.com/";
    String customerServiceLocator="#nav-xshop > a:nth-child(5)";
String textBookRentalsLocator="//*[@id=\"nav-subnav\"]/a[7]/span";
String buttonName="Textbook Rentals";
String todaysDealsLocator="//*[@id=\"nav-xshop\"]/a[2]";
    @BeforeMethod
    public void setUp(){
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
    }
    public void checkCustomerService(){
        driver.findElement(By.cssSelector(customerServiceLocator)).click();
    }

    public void checkTextBookRentals(){
        driver.findElement(By.linkText(buttonName)).click();
    }

    public void checkBestSellers(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
    }

    public void checkBestSellers1(){
        driver.findElement(By.linkText("Best Sellers")).click();

    }
    public void checkTodaysDeals() {  //failed
        driver.findElement(By.xpath(todaysDealsLocator)).click();
    }

        public void checkTodaysDeals1(){

            driver.findElement(By.linkText("Today's Deals")).click();
        }




    @AfterMethod
    public void tearDown(){
        // driver.close();
        driver.quit();
    }

}
