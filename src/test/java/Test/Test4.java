package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// demoqa.com
// Radio Button test
public class Test4 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = element.isEnabled();
        if(isEnabled){
            element.click();
            System.out.println("Clicked button.");
        }

        WebElement element2 = driver.findElement(By.id("yesRadio"));
        boolean isSelected = element2.isSelected();
        if (isSelected){
            System.out.println("Yes radio button is selected.");
        }

        WebElement element1 = driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(element1.getText());

        WebElement element3 = driver.findElement(By.id("noRadio"));
        boolean b = element3.isEnabled();
        System.out.println(b);
    }
}
