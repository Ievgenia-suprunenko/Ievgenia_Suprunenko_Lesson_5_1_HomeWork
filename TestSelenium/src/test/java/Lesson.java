import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenia/Downloads/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/");

        WebElement searchField = webDriver.findElement(By.name("search_query"));
        searchField.sendKeys("T-shirt");
        searchField.submit();

        WebElement searchButton = webDriver.findElement(By.id("search_query_top"));
        searchButton.click();
    }
}
