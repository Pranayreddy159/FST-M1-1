import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity_9_1 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://training-support.net/selenium/selects");
        String title= driver.getTitle();
        System.out.println("Page Title: "+title);
        WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"single-select\"]"));
        WebElement chosen = driver.findElement(By.id("single-value"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Option 2");
        System.out.println(chosen.getText());
        select.selectByIndex(3);
        System.out.println(chosen.getText());

        select.selectByValue("4");
        System.out.println(chosen.getText());
        List<WebElement> Options =select.getOptions();
        for (WebElement option :Options){
            System.out.println("Option: "+option.getText());
        }
        driver.close();
    }

}
