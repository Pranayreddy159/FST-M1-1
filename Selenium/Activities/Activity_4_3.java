import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String pagetitle=driver.getTitle();
        System.out.println("Page Title is:"+pagetitle);
        String thirdheader=driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("third header: "+thirdheader);
        WebElement fifthheader=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        String fifthcolour=fifthheader.getCssValue("color").toString();
        System.out.println("fifth colour:"+fifthcolour);
        String voilet_button= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("Class attributes : "+voilet_button);
        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey Button text: " + greyButton);
        // Close the browser
        driver.close();
    }
}
