package ProjectActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class jobBoard_Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        WebElement page  = driver.findElement(By.xpath("//h2[text() = 'Quia quis non']"));
        String Page_title = page.getText();
        System.out.println(Page_title);
        Assert.assertEquals(Page_title, "Quia quis non");
        driver.close();

    }
}
