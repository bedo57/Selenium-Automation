package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

// demoqa.com
// Date Picker test
public class Test15 {

    WebDriver driver;

    @Test
    public void Test(){

        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");

        selectDate("2000","August" , "10");
    }

    private void selectDate(String year, String month, String day){
        WebElement dateSelection = driver.findElement(By.id("datePickerMonthYearInput"));
        dateSelection.click();

        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));

        Select select = new Select(monthElement);
        select.selectByVisibleText(month);

        select = new Select(yearElement);
        select.selectByVisibleText(year);

        List<WebElement> dayElement = driver.findElements(By.cssSelector("div.react-datepicker__day"));
        for (WebElement element : dayElement){
            String text = element.getText();
            if (text.equals(day)){
                element.click();
                break;
            }
        }
    }
}
