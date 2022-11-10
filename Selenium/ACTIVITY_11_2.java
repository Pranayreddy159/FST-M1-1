import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACTIVITY_11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("page title is: " + driver.getTitle());
       WebElement confbutton = driver.findElement(By.xpath(" //*[@id=\"confirm\"]"));
       confbutton.click();
        Thread.sleep(5000);
        Alert button = driver.switchTo().alert();
        System.out.println("alert text is: "+button.getText());
        button.accept();
        Thread.sleep(5000);
        confbutton.click();
        Thread.sleep(5000);
        button.dismiss();
        Thread.sleep(5000);
        driver.quit();
    }





}
