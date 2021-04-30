import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class BaseTest {

    protected WebDriver driver;
    GittiGidiyor gittigidiyor;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        gittigidiyor= new GittiGidiyor(driver);
    }

   /* @AfterAll
    public  void tearDown(){
        driver.quit();

    }
*/
}
