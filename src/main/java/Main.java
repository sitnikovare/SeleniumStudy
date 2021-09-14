import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //явное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //неявное ожидание
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));

        driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//input[aria-label='Найти']"));

        input.click();
        }
}
