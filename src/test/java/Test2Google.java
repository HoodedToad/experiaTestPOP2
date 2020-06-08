import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2Google {
    WebDriver driver;
    String url;
    WebDriverWait wait;


    @BeforeTest
    public void setUp() {
        System.out.println("Opening chrome browser");
        //System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        new WebDriverWait(driver, 5);

    }

    @AfterTest
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        //driver.quit();
    }

    @Test
    public void testConnectionGoogle() {

        url = "https://www.google.com/";
        System.out.println("Connection to Page " + url);

        driver.get(url);

        WebElement Input;
        //Input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
        Input = driver.findElement(By.xpath("//input[@name='q']"));
        Input.click();
        Input.sendKeys("abrakadabra");
    }
}
