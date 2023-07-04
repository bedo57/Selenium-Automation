package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

// demoqa.com
// Upload and Download test
public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        //////////////////////////////////

        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys("C:\\Users\\yilma\\OneDrive\\Masaüstü\\Kerpe\\20220702_161456.jpg");


        /////////////////////////////////

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();
        Thread.sleep(3000);

        String path = "C:\\Users\\yilma\\Downloads";
        String fileName = "sampleFile.jpeg";

        boolean isDownloaded = isFileDownloaded(path, fileName);
        System.out.println(isDownloaded);

    }

    public static boolean isFileDownloaded(String path, String fileName){
        File file = new File(path);
        File[] files = file.listFiles();

        for (int i=0; i<files.length; i++){
            if (files[i].getName().equals(fileName)){
                files[i].delete();
                return true;
            }
        }
        return false;
    }
}
