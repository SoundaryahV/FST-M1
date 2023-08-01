package ProjectActivity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jobBoard_Activity1 {



        WebDriver driver;

        @BeforeMethod
        public void beforemethod() throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://alchemy.hguy.co/jobs/");
            Thread.sleep(10);
        }
        @Test
                public void Validatetitle()
        {
            String title = driver.getTitle();
            System.out.println(title);
            Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
        }

@AfterMethod
      public void closebrowser()
        {
            driver.close();
        }

    }

