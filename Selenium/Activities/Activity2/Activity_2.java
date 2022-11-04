import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");

        String pagetitle=driver.getTitle();
        System.out.println("Page Title is:"+pagetitle);

        //finding element
        WebElement idloc=driver.findElement(By.id("about-link"));
        System.out.println("Text: "+idloc.getText());
        WebElement classloc=driver.findElement(By.className("green"));
        System.out.println("Text: "+classloc.getText());
        WebElement linktextloc=driver.findElement(By.cssSelector(".green"));
        System.out.println("Text: "+linktextloc.getText());
        WebElement cssloc=driver.findElement(By.linkText("About Us"));
        System.out.println("Text: "+cssloc.getText());



        // Close the browser
        driver.close();
    }

}
