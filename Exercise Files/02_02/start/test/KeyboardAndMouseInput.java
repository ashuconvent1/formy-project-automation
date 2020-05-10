import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mihirphatakwala/Downloads/chromeDriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup");

        WebElement name = driver.findElement(By.id("firstName"));
        name.click();
        name.sendKeys("Ashley");

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("Ashley lewis");

        WebElement password = driver.findElement(By.name("Passwd"));
        password.click();
        password.sendKeys("Malhotra@123");

        WebElement confirm = driver.findElement(By.name("ConfirmPasswd"));
        confirm.click();
        confirm.sendKeys("Malhotra@123");

        WebElement button =driver.findElement(By.id("accountDetailsNext"));
        button.click();

        driver.quit();
    }
}
