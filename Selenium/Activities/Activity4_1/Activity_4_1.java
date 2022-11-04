import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");

        String pagetitle=driver.getTitle();
        System.out.println("Page Title is:"+pagetitle);

        //finding element
        WebElement idloc=driver.findElement(By.xpath("//a[@id=\"about-link\"]"));
        idloc.click();
        pagetitle=driver.getTitle();
        System.out.println("Page Title is:"+pagetitle);



        // Close the browser
        driver.close();
    }

}
