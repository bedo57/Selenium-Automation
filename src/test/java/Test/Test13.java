package Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// demoqa.com
// Accordian test
public class Test13 {

    WebDriver driver;

    @Test
    public void Test() throws InterruptedException {

        driver = new ChromeDriver();

        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        driver.get("https://demoqa.com/accordian");


        WebElement firstCard = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
        String className = firstCard.getAttribute("class");
        System.out.println(className);

        driver.findElement(By.id("section1Heading")).click();
        className = firstCard.getAttribute("class");
        System.out.println(className);

        Thread.sleep(1000);
        className = firstCard.getAttribute("class");
        System.out.println(className);
    }
}
