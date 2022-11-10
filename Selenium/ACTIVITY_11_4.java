import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ACTIVITY_11_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("page title is: " + driver.getTitle());
        System.out.println("Parent Handle"+driver.getWindowHandle());
        driver.findElement(By.xpath("//*[@id=\"launcher\"]")).click();
        System.out.println("Parent page title is: " + driver.getTitle());
        System.out.println("Parent page HEADING is: " + driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div")).getText());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Set<String> h = driver.getWindowHandles();
        System.out.println("set of handles: "+h);
        //Loop through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("----------------------------Opening new tab--------------------------------------------");
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("page title is: " + driver.getTitle());
        System.out.println("page HEADING is: " + driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div")).getText());
        System.out.println("Current Handle"+driver.getWindowHandle());
        driver.findElement(By.id("actionButton")).click();
        System.out.println("----------------------------Opening new tab--------------------------------------------");
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println("page title is: " + driver.getTitle());
        System.out.println("page HEADING is: " + driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div")).getText());
        System.out.println("Current Handle"+driver.getWindowHandle());


        driver.quit();


    }
}
