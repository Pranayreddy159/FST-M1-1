import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_activity_3 {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod(){
        driver =new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @AfterMethod
    public void aftermethod(){
        driver.quit();
    }
    @Test
    public void testmethod1(){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        String welcomemsg=driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        Assert.assertEquals("Welcome Back, admin",welcomemsg);
    }
}
