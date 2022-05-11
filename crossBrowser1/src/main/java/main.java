import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class main {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\ma.bharadwaj\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ma.bharadwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://techtuts.in/");
        driver.manage().window().maximize();
        List<WebElement> count=driver.findElements((By.tagName("iframe")));
        System.out.println("Total iFrames : " + count.size());
     for(int i=0; i<count.size(); i++){
            driver.switchTo().defaultContent();
            driver.switchTo().frame(i);
     }
     //all of these points from 21-26 are not working because the element google_esf can't be found & neither the frames.
        driver.switchTo().defaultContent();
        driver.switchTo().frame("google_esf");
        driver.switchTo().frame(count.size()-1);
        driver.findElement(By.tagName("body")).click();
    }
}
