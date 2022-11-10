import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Activity_10_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        String title= driver.getTitle();
        System.out.println("Page title: "+title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        WebElement KeyPressed= driver.findElement(By.xpath("//*[@id=\"keyPressed\"]"));
        action.sendKeys("K").build().perform();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(KeyPressed));
        System.out.println("Key pressed is: "+KeyPressed.getText());
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();       // action.sendKeys(Keys.CONTROL).sendKeys("C").build().perform();
        System.out.println("Key pressed is: "+KeyPressed.getText());
        driver.quit();
    }
}
