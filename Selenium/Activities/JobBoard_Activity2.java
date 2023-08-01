package ProjectActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoard_Activity2 {


    WebDriver driver;

    @BeforeMethod
    public void beforemethod() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        Thread.sleep(10);
    }

    @Test

    public void validate()
    {
        WebElement page  = driver.findElement(By.xpath("//h1[@class = 'entry-title']"));
        String Page_title = page.getText();
        System.out.println(Page_title);
        Assert.assertEquals(Page_title, "Welcome to Alchemy Jobs");
    }

    @AfterMethod
    public void closebrowser()
    {
        driver.close();
    }

}
