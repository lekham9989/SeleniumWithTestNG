import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSeleniumPractice {

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


    @Test(priority = 0)
    public void openBrowser(){
        driver.get("https://www.google.com");
        System.out.println("Opening the Browser");
    }

    @Test(priority = 1)
    public void signUp(){
        System.out.println("Signing Up");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("Loging in");
    }

    @Test(priority = 3)
    public void addToCart(){
        System.out.println("Add items to cart");
    }

    @Test(priority = 4)
    public void checkOut(){
        System.out.println("checking Out");
    }

    @Test(priority = 5)
    public void logOut(){
        System.out.println("Logging Out");
    }

}
