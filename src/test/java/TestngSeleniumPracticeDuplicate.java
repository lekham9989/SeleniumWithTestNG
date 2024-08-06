import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSeleniumPracticeDuplicate {

    WebDriver driver;

    @BeforeTest
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void stepDown(){
        driver.quit();
    }

   @Test
    public void sampleTest(){
        System.out.println("Hello World");
    }

    @Test
    public void openBrowser(){
        driver.get("https://www.google.com");
        System.out.println("Opening the Browser");
    }

    @Test
    public void signUp(){
        System.out.println("Signing Up");
    }

    @Test
    public void login(){
        System.out.println("Loging in");
    }

    @Test
    public void addToCart(){
        System.out.println("Add items to cart");
    }

    @Test
    public void checkOut(){
        System.out.println("checking Out");
    }

    @Test
    public void logOut(){
        System.out.println("Logging Out");
    }

    @Test
    public void closeBrowser(){
        System.out.println("Closing Browser");

    }


}
