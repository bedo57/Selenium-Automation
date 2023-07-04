package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

// demoqa.com
// Frame test
public class Test11 {

    WebDriver driver;

    @Test
    public void test(){
        driver = new ChromeDriver();
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");

        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1"); // frame1 girer

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);

        driver.switchTo().parentFrame(); // Ana frame döner

        List<WebElement> elementList = new ArrayList<>(driver.findElements(By.cssSelector("div[id='framesWrapper'] div")));
        String metin = elementList.get(0).getText();
        System.out.println(metin);

    }
}
