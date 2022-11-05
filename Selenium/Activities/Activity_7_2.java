import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_7_2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        String title= driver.getTitle();
        System.out.println("Page Title: "+title);
        WebElement Username= driver.findElement(By.xpath("//input[contains(@class,\"-username\")]"));
        WebElement password= driver.findElement(By.xpath("//input[contains(@class,\"-password\")]"));
        WebElement Confirmpassword= driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input"));
        WebElement Email= driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[4]/input"));
        WebElement SignUpbutton= driver.findElement(By.xpath("(//*[@id=\"dynamic-attributes-form\"]/div/button)[2]"));

        Username.sendKeys("Pranay");
        password.sendKeys("Admin123");
        Confirmpassword.sendKeys("Admin123");
        Email.sendKeys("Pranay@email.com");
        SignUpbutton.click();
        WebElement welcomeMsg= driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        wait.until(ExpectedConditions.visibilityOf(welcomeMsg));
        String WelcomeMsgText=welcomeMsg.getText();
        System.out.println("WelcomeMsgText :"+WelcomeMsgText);
        driver.close();
    }
}
