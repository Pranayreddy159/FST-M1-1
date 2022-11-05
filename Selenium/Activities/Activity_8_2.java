import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity_8_2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get(" https://training-support.net/selenium/tables");
        String title= driver.getTitle();
        System.out.println("Page Title: "+title);
        List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr"));
        System.out.println("Columns-> "+cols.size());
        System.out.println("Rows-> "+rows.size());
        String ValueBefSort=driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]")).getText();
        System.out.println("Value of 2x2 before sort : "+ValueBefSort);
        driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[1]")).click();
        String ValueAftSort=driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]")).getText();
        System.out.println("Value of 2x2 After sort : "+ValueAftSort);
        String footer=driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tfoot/tr")).getText();
        System.out.println("Footer value : "+footer);
        driver.close();
    }
}
