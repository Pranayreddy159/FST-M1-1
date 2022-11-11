import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACTIVITY_12_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/nested-iframes");
        System.out.println("page title is: " + driver.getTitle());
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        System.out.println("Frame 1 Heading : "+driver.findElement(By.xpath("//div[contains(text(),'This is the first frame!')]")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        System.out.println("Frame 2 Heading : "+driver.findElement(By.xpath("//div[contains(text(),'This is the second frame!')]")).getText());


        driver.quit();
    }
    }
//    Traverse into the iframe that is on the page.
//        Traverse into the first iframe in that frame.
//        Print the heading of that frame.
//        Navigate to the second iframe in that frame.
//        Print the heading of that frame.