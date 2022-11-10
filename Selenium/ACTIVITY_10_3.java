import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACTIVITY_10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("page title is: " + driver.getTitle());
        Actions action = new Actions(driver);
        WebElement ball = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement zoneone = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        WebElement zonetwo = driver.findElement(By.xpath("//*[@id=\"dropzone2\"]"));
        action.dragAndDrop(ball,zoneone).build().perform();
       wait.until(ExpectedConditions.attributeToBeNotEmpty(zoneone,"background-color"));
        System.out.println("color = "+zoneone.getCssValue("background-color"));
        action.dragAndDrop(ball,zonetwo).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(zonetwo,"background-color"));

        System.out.println("color = "+zonetwo.getCssValue("background-color"));


        driver.quit();

    }

}
