import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity_10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        String title= driver.getTitle();
        System.out.println("Page title: "+title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        //left click
        action.click().build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement cube= driver.findElement(By.className("active"));
        System.out.println("Cube value after left click : "+cube.getText());
        //Double click
        action.doubleClick().build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Cube value after Double click : "+driver.findElement(By.className("active")).getText());
        //Right click
        action.contextClick().build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Cube value after Right click : "+driver.findElement(By.className("active")).getText());
        driver.quit();
    }
}
