import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity_9_2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://training-support.net/selenium/selects");
        String title= driver.getTitle();
        System.out.println("Page Title: "+title);
        Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"multi-select\"]")));
        WebElement chosen = driver.findElement(By.id("multi-value"));
        if(dropdown.isMultiple()){
//            Select the 'JavaScript' option by visible text.
            dropdown.selectByVisibleText("Javascript");
            System.out.println("Selected Option: "+chosen.getText());
//            Select the 'NodeJS' option by value.
            dropdown.selectByValue("node");
            System.out.println("Selected Option: "+chosen.getText());
//            Select the 4th, 5th, and the 6th options by index.
            for(int i=4;i<=6;i++){
                dropdown.selectByIndex(i);
                System.out.println("Selected Option: "+chosen.getText());
            }
//            Deselect the 'NodeJS' option by value attribute.
            dropdown.deselectByValue("node");
            System.out.println("Selected Option: "+chosen.getText());

//            Deselect the 7th option by index.
            dropdown.deselectByIndex(7);
            System.out.println("Selected Option: "+chosen.getText());


//            Print the first selected option.
            System.out.println("first selected option: "+dropdown.getFirstSelectedOption().getText());
//                    Print all selected options one by one and deselect all options.
            List<WebElement> options=dropdown.getAllSelectedOptions();
            for(WebElement option:options){
                int a=1;
                System.out.println("selected option"+a+" :"+option.getText());
                a++;
            }
            System.out.println("Selected Option: "+chosen.getText());

        }


        driver.close();
    }

}
