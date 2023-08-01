package ProjectActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobBoard_Activity3 {

    WebDriver driver;

    @BeforeMethod
    public void beforemethod() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        Thread.sleep(10);
    }


        @Test

         public void getimageheader() {
            WebElement getImgSrc = driver.findElement(By.xpath("//img[contains(@class, 'attachment-large size-large wp-post-image')]"));
            String getImgURL = getImgSrc.getAttribute("src");
            System.out.println(getImgURL);
        }

    @AfterMethod
    public void closebrowser()
    {
        driver.close();
    }


}
