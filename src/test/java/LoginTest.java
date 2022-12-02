import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
    public static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        ChromeDriver webdriver = new ChromeDriver();
        driver = webdriver.Chrome("path\chromedriver.exe")
    }
    @Test
    public void doLoginTest() {
        driver.get("http://gmail.com");
        driver.findElement(By.id("Email")).sendKeys("danielherbison@gmail.com");
        driver.findElement(By.id("Passwd")).sendKeys("dfsfaf");
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
