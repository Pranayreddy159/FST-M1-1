import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_6_2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://www.training-support.net/selenium/ajax");
        String title= driver.getTitle();
        System.out.println("Page Title: "+title);
        WebElement changecontentButton= driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
        changecontentButton.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h1"),"HELLO!"));
        WebElement Hello= driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h1"));
        String HelloMsg=Hello.getText();
        System.out.println("Message : "+HelloMsg);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h3"),"I'm late!"));
        WebElement LateMsg= driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h3"));
        String LateMessage=LateMsg.getText();
        System.out.println("LAte Message : "+LateMessage);
        driver.close();
    }
}
