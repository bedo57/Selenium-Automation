package Test;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

// demoqa.com
// Broken Links - Images test
public class Test7 {
    public static void main(String[] args) throws IOException {
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();
/*
        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImageUrl = brokenImage.getAttribute("src");

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(brokenImageUrl);
        CloseableHttpResponse response = client.execute(request);
        int statusCode = response.getCode();
        System.out.println(statusCode);
*/


        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        CloseableHttpResponse response = client.execute(request);
        int statusCode = response.getCode();
        System.out.println(statusCode);

    }
}
