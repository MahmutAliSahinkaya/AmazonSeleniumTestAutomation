package base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    protected WebDriver driver ;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahmu\\IdeaProjects\\AmazonSeleniumTestAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
