package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {

        System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");

        List<WebElement> cookieButtons = driver.findElements(
                By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']")
        );

        if (!cookieButtons.isEmpty() && cookieButtons.get(0).isDisplayed()) {
            cookieButtons.get(0).click();
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}