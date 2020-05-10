import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mihirphatakwala/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

       WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
       checkBox1.click();

       WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
       checkbox2.click();

       WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));
       checkBox3.click();
        driver.quit();
    }
}
