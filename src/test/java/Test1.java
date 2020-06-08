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

public class Test1 {

    WebDriver driver;
    String url;
    WebDriverWait wait;


    @BeforeTest
    public void setUp() {
        System.out.println("Opening chrome browser");
        //System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        wait = new WebDriverWait(this.driver, 5);

    }

    @AfterTest
    public void tearDown() throws Exception {
        Thread.sleep(5000);
        //driver.quit();
    }

    @Test
    public void testConnection1() {
        url = "https://www.expedia.com/";
        System.out.println("Connection to Page " + url);

        driver.get(url);

        WebElement ExpediaLogo;
        ExpediaLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt ='expedia logo']")));

        //ExpediaLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div/header/div[1]/div/a/img")));
        //wait.until(ExpectedConditions.visibilityOf(ExpediaLogo));
        assert ExpediaLogo.isDisplayed();
        WebElement StaysTab;
        WebElement CarsTab;
        StaysTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='?pwaLOB=wizard-hotel-pwa-v2']")));
        //StaysTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")));
        //StaysTab = driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']"));
        StaysTab.click();
        CarsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='?pwaLOB=wizard-car-pwa']")));
        CarsTab.click();



        System.out.println("Url contifmed : " + driver.getCurrentUrl());
        System.out.println("Page " + driver.getTitle()+ " Succesfully opened !");





    }
    @Test
    public void testConnection2() {
        url = "https://www.expedia.com/";
        System.out.println("Connection to Page " + url);

        driver.get(url);

        WebElement ExpediaLogo;
        ExpediaLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt ='www.expedia.com']")));

        //ExpediaLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div/header/div[1]/div/a/img")));
        //wait.until(ExpectedConditions.visibilityOf(ExpediaLogo));
        assert ExpediaLogo.isDisplayed();
        WebElement HotelsTab;
        WebElement CarsTab;
        HotelsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")));
        //StaysTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")));
        //StaysTab = driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']"));
        HotelsTab.click();
        CarsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-section-id='#section-car-tab-hp']")));
        CarsTab.click();



        System.out.println("Url contifmed : " + driver.getCurrentUrl());
        System.out.println("Page " + driver.getTitle()+ " Succesfully opened !");
    }
}
