import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test3OneClass {
    WebDriver driver;
    String url;
    WebDriverWait wait;

    @Test
    public void testConn() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        url = "https://www.google.com/";
        driver.get(url);

        WebElement searchBar;
        searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
        searchBar.click();
        searchBar.sendKeys("Abra");
    }
}
