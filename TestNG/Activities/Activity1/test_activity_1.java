import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_activity_1 {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod(){
        driver =new FirefoxDriver();
        driver.get("https://www.training-support.net/");
    }
    @AfterMethod
    public void aftermethod(){
        driver.quit();
    }
    @Test
    public void testexm(){
        String title=driver.getTitle();
        Assert.assertEquals("Training Support", title);
        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
        String abouttitle=driver.getTitle();
        Assert.assertEquals("About Training Support", abouttitle);

    }
}
