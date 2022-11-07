import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_activity_2 {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod(){
        driver =new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @AfterMethod
    public void aftermethod(){
        driver.quit();
    }
    @Test
    public void testmethod1(){
        String title=driver.getTitle();
        System.out.println("Title of current page :"+title);
        Assert.assertEquals("Target Practice", title);
    }
    @Test
    public void testmethod2(){
        WebElement blackbutton=driver.findElement(By.xpath("//button[contains(@class,'black')]"));
        Assert.assertTrue(blackbutton.isDisplayed());
        Assert.assertEquals(blackbutton.getText(),"black");
    }
    @Test(enabled = false)
    public void testmethod3(){
        System.out.println("This method expected to be skipped");
    }
    @Test
    public void testmethod4(){
        throw new SkipException("Skipping the testcase");
    }
}
