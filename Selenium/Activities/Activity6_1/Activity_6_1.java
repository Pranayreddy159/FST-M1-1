import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity_6_1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Find the checkbox button
        WebElement checkbox_button = driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        checkbox_button.click();
        System.out.println("The toggle checkbox button is clicked: " );
        //checking the visibility of check box
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        checkbox_button.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        //Close the browser
        driver.close();
    }
}
