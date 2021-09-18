import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*------------------------------------------------------------------------------------------------*/

        //явное ожидание
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //неявное ожидание
        //WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
        //        .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));

        //driver.get("https://google.com");
        //WebElement input = driver.findElement(By.xpath("//input[aria-label='Найти']"));
        //input.click();

        /*------------------------------------------------------------------------------------------------*/

//        driver.get("https://www.avito.ru/rossiya/avtomobili");
//        WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));
//        String par = element.getAttribute("offsetWidth");
//        System.out.println(par);

        /*------------------------------------------------------------------------------------------------*/

//        driver.get("https://www.avito.ru/rossiya");
//        WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));
//        String par = element.getText();
//        System.out.println(par);

        /*------------------------------------------------------------------------------------------------*/

//        driver.get("https://dev.by");
//        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
//        String par = element.getCssValue("display");
//        System.out.println(par);

        /*------------------------------------------------------------------------------------------------*/

//        driver.get("https://udemy.com");
//        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
//
//        element.sendKeys("Java", Keys.ENTER);

        /*------------------------------------------------------------------------------------------------*/


        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);

            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);

            //actions.moveToElement(element1).clickAndHold().moveToElement(element2)
            //        .release().build().perform();

            actions.dragAndDrop(element1, element2)
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000);
            driver.quit();
        }

    }
}
