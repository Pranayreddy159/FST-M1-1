import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        String pagetitle=driver.getTitle();
        System.out.println("Page Title is:"+pagetitle);

        //finding element
        WebElement firstname= driver.findElement(By.id("firstName"));
        firstname.sendKeys("Saahil");


        WebElement lastname= driver.findElement(By.id("lastName"));
        lastname.sendKeys("Sharma");

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("saahil@email.com");
        WebElement phone= driver.findElement(By.id("number"));
        phone.sendKeys("+911234567891");

        WebElement Submit= driver.findElement(By.cssSelector("ui green button"));
        Submit.click();





        // Close the browser
        driver.close();
    }

}
