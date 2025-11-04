package Package1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\STAD\\Software\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();  // Automatically downloads matching driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.googlr.com/");
        driver.quit();

        System.out.println("-------------MOHIT-----------------------");






            }

}
