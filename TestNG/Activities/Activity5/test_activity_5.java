import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class test_activity_5 {
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void beforemethod(){
        driver =new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @AfterTest(alwaysRun = true)
    public void aftermethod(){
        driver.quit();
    }
    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void title(){
        System.out.println(driver.getTitle());
    }
    @Test (dependsOnMethods = {"title"},groups = {"HeaderTests"})
    public void Headertest1(){
        WebElement h3= driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        String header3=h3.getText();
        Assert.assertEquals("Third header",header3);
    }
    @Test (dependsOnMethods = {"title"},groups = {"HeaderTests"})
        public void HeaderTest2() {
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }
    @Test (dependsOnMethods = {"title"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");
    }
    @Test (dependsOnMethods = {"title"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }
}
