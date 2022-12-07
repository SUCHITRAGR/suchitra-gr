package classfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
    static WebDriver driver;
    public void login() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
//        WebElement ele=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//        ele.sendKeys("standard_user");
//        WebElement pwd=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//        pwd.sendKeys("secret_sauce");
//        WebElement bu= driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
//        bu.click();



    }
    public void textbox(){
        WebElement ele=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
        ele.sendKeys("standard_user");
        WebElement pwd=driver.findElement(By.xpath("//input[@id=\"password\"]"));
        pwd.sendKeys("secret_sauce");
        WebElement bu= driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
        bu.click();
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();


   }
   public void cart(){
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
   }
   public void checkout() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("suchitra");
        driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("G R");
        driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("577539");
       Actions act=new Actions(driver);
       act.sendKeys(Keys.PAGE_DOWN).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
       driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
       driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();

   }
}
