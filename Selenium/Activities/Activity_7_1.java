import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_7_1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        String title= driver.getTitle();
        System.out.println("Page Title: "+title);
        WebElement Username= driver.findElement(By.xpath("//input[starts-with(@class,\"username\")]"));
        WebElement password= driver.findElement(By.xpath("//input[starts-with(@class,\"password\")]"));
        Username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button")).click();
        WebElement welcomeMsg= driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        wait.until(ExpectedConditions.visibilityOf(welcomeMsg));
        String WelcomeMsgText=welcomeMsg.getText();
        System.out.println("WelcomeMsgText :"+WelcomeMsgText);
        driver.close();
    }
}
