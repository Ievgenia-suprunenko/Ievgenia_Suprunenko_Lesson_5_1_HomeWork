import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenia/Downloads/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        WebElement searchFieeld = webDriver.findElement(By.cssSelector(".gLFyf"));
        searchFieeld.sendKeys("ITEA HUB Lviv");
        searchFieeld.submit();
    }
}
