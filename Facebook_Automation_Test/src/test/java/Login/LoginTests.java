package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium webDriver
    private WebDriver driver;
    //import chromeDriver

    public void setUp() throws InterruptedException{
        System.setProperty ("webdriver.chrome.driver","resources/chromedriver.exe");
        driver =new ChromeDriver();
    //input project URL =facebook URL
        driver.get ("https://www.facebook.com/");
        //waiting for globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);

        //maximize the windows
        driver.manage ().window ().maximize();

        //get page title
        System.out.println (driver.getTitle());

        //Locate username field

        driver.findElement(By.name("email")).sendKeys("09025537897");

        //locate password field
        driver.findElement(By.name("pass")).sendKeys("SEXXY007");

        //click the sign button
        driver.findElement(By.xpath (("//*[@id=\"u_0_b\"]"))).click ();
          Thread.sleep(7000);

          //close the browser after test
        driver.quit();

    }

    //initiate the test run command

    public static void main(String args[])throws InterruptedException{
        LoginTests test = new LoginTests();
        test.setUp();
    }


}
