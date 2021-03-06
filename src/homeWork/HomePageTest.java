package homeWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage1{

//    @Test(priority = 2)
//    public void testCheckSearchBox(){
//        checkSearchBox();
//        String expectedText="\"Mask\"";
//        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
//        Assert.assertEquals(actualText,expectedText,"Product does not match");
//    }
//
//    @Test(priority = 1)
//    public void testPageTitle(){
//        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Page Title not match");
  //  }
    @Test (priority = 1)
public void testCustomerService(){
        checkCustomerService();
    String expectedText="Amazon.com Help: Help & Customer Service";
    String actualText=driver.getTitle();
      //  System.out.println(actualText);
    Assert.assertEquals(actualText,expectedText,"Page Title not match");
}
@Test()
public void testTextBookRentals(){
    checkTextBookRentals();
    String expectedText="Amazon.com: Textbook Rentals";
    String actualText=driver.getTitle();
    System.out.println(actualText);
    Assert.assertEquals(actualText,expectedText,"Page Title not match");

}
@Test(priority = 1)
public void testBestSellersGetText(){
        checkBestSellers();
        String expectedTest="Best Sellers";
        String actualTest=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
        Assert.assertEquals(actualTest,expectedTest,"text don't match");

}
@Test
public  void testBestSellersGetclick(){

        checkBestSellers1();
        String expectedTest="Amazon.com Best Sellers: The most popular items on Amazon"; //title found star
    String actualTest=driver.getTitle();
    Assert.assertEquals(actualTest,expectedTest,"don't match");
}
@Test
public void testTodaysDealsGetText(){
        checkTodaysDeals();
        String expectedTest="Today's Deals";
        String actualTest=driver.findElement(By.xpath(todaysDealsLocator)).getText();
        Assert.assertEquals(actualTest,expectedTest,"don't match");
}
@Test  // when it's get click i have to copy the title in the site web in string expected
public void testTodaysDealsGetClick(){
        checkTodaysDeals1();
    String expectedTest="Gold Box Deals | Today's Deals - Amazon.com";
    String actualTest=driver.getTitle();
    Assert.assertEquals(actualTest,expectedTest,"don't match");
}


    // test Amazon Assistant functionality
    @Test()
    public  void testAmazonAssistant(){
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[8]/a")).click();
        String expectedPage="Amazon Assistant";
        String actualPage= driver.getTitle();
        Assert.assertEquals(actualPage,expectedPage," testing SellProductsOonAmazon ");
    }


    // test cart if it is displaying
    @Test
    public void verifyCart(){
        boolean expectedAmazonCart=true;
        boolean actualAmazonLCart=driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
        Assert.assertEquals(actualAmazonLCart,expectedAmazonCart,"test");
    }

    // test customer service functionality
    @Test()
    public void testCustomerServiceFunctionality(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        String expectedText="Hello. What can we help you with?";
        String actualTest= driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).getText();
        Assert.assertEquals(actualTest, expectedText, "testing");
    }



    // test books functionality
    @Test()
    public void testBooksFunctionality(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/a/div/div[2]/span")).click();
        String expectedText="Arts & Photography Books";
        String actualTest= driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/h1/b")).getText();
        Assert.assertEquals(actualTest, expectedText, "testing");
    }



    // test about amazon functionality
    @Test()
    public void testAboutAmazon(){
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")).click();
        String expectedTitle="About Amazon";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "testing");
    }


    // test amazon devices
    @Test()
    public void testAmazonDevices(){
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")).click();
        String expectedTitle="Amazon Devices - Official Site - Kindle, Fire, Echo devices";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "testing");
    }

    // test  check amazon cart
    @Test()
    public void testCheckAmazonCart(){
        driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]")).click();

        String expectedTitle="Amazon.com Shopping Cart";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "testing");
    }


    // test  Returns And Orders
    @Test()
    public void testReturnsAndOrders(){
        driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();

        String expectedTitle="Amazon Sign-In";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "testing");
    }


    // test Whole Foods Market
    @Test()
    public void testWholeFoodsMarket(){
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[3]/a/span")).click();

        String expectedTitle="Whole Foods Market | Whatever Makes You Whole";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "testing");
    }


    // test best sellers
    @Test()
    public void testBestSellers(){
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();

        String expectedTitle="Amazon.com Best Sellers: The most popular items on Amazon";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "testing");
    }


    // test change language in amazon header
    @Test()
    public void testChangeLanguageHeader(){
        // hello
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/span")).click();
        driver.findElement(By.className("a-button-input")).click();
        String expectedTitle="Amazon.com: Compras en Línea de Electrónicos, Ropa, Computadoras, Libros, DVDs y más";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"language changed ");

    }

}


