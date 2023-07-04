package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// demoqa.com
// Practice Form test

public class Test3 {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckBox.isEnabled();  // .isEnabled  ->  checkbox tıklanılanan bişi ise true , değilse false döner

        WebElement sportCheckBoxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        if (isEnabled){
            try {
                System.out.println("Entered try block !");
                sportCheckBox.click();
            } catch (Exception e){
                sportCheckBoxLabel.click();
                System.out.println("Entered catch block !");
            }
        }

        boolean isSelected = sportCheckBox.isSelected();
        System.out.println(isSelected);

    }
}
