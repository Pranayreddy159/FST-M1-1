import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class ACTIVITY_12_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/iframes");
        System.out.println("page title is: " + driver.getTitle());
        driver.switchTo().frame(0);

        System.out.println("Frame 1 Heading : "+driver.findElement(By.xpath("//div[contains(text(),'This is the first frame!')]")).getText());
        WebElement Frame1button1 = driver.findElement(By.xpath("//*[@id=\"actionButton\"]"));
        System.out.println("button1 text is :"+Frame1button1.getText());
        System.out.println("button1 color is :"+Frame1button1.getCssValue("color"));
        Frame1button1.click();
        System.out.println("button2 text is :"+Frame1button1.getText());
        System.out.println("button2 color is :"+Frame1button1.getCssValue("color").toString());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println("Frame 2 Heading : "+driver.findElement(By.xpath("//div[contains(text(),'This is the second frame!')]")).getText());
         WebElement Frame2button1 = driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));
        System.out.println("button1 text is :"+Frame2button1.getText());
        System.out.println("button1 color is :"+Frame2button1.getCssValue("color"));
        JavascriptExecutor je= (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,250)");
        Frame2button1.click();
        System.out.println("button2 text is :"+Frame2button1.getText());
        System.out.println("button2 color is :"+Frame2button1.getCssValue("color").toString());
        driver.quit();


    }
    }
//    Print the Heading of the 1st iframe.
//        Print the Button Text and color of the button in that frame.
//        Click th button in that frame.
//        Print the new Button Text and color of the button.
//        Repeat Steps 3-6 with the 2nd iframe.