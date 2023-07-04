package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// demoqa.com
// Textbox test

public class Test1 {

    public static void main(String[] args) {

        System.setProperty("chromeDriver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // driver.get("https://demoqa.com/");  // .get -> O sayfaya gider.


        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();    // .manage().window().maximize()  -> Ekranı büyütür


        WebElement fullName = driver.findElement(By.id("userName"));  // .findElement  -> İstenilen elemente gider
        fullName.click();    // .click  ->  elemente tıklar
        fullName.sendKeys("Bedirhan");   // .sendKeys  -> Elemente veri yollar


        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("bedoyilmaz@gmail.com");


        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Kocaeli");


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Kocaeli");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();


        ////////////////

        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nameText.getText();   // .getText  ->  Oradaki metni alır
        System.out.println(name);

        WebElement emailText = driver.findElement(By.xpath("//div/p[@id='email']"));
        String emailTx = emailText.getText();
        System.out.println(emailTx);

        WebElement currentAddressText = driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String currentAddressTx = currentAddressText.getText();
        System.out.println(currentAddressTx);

        WebElement permanentAddressText = driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String permanentAddressTx = permanentAddressText.getText();
        System.out.println(permanentAddressTx);
    }

}
