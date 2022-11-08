import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity1 {

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
        //Find the page title and match with "OrangeHRM"
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"OrangeHRM");
        //close the browser
        driver.quit();
    }
}

