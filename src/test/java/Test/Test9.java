package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// demoqa.com
// Browser Windows test
public class Test9 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();


        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> Tabs = new ArrayList<>(driver.getWindowHandles());  // chorome ekranları listeye aldık
        System.out.println(Tabs.size());    // Kaç ekran olduğunu bulduk

        driver.switchTo().window(Tabs.get(1));  // Ekranı değiştirdik

        System.out.println(driver.getCurrentUrl()); // Bulunduğu ekranın url adresini yazdırdık
        driver.close();     // Ekranı kapattık

    }
}
