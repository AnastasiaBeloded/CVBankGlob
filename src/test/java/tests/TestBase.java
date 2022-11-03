package tests;

import manager.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class TestBase {
    static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));



    @BeforeSuite
    public void setUp() {
        app.init();
    }
    @AfterSuite
    public void tearDown(){
      //  app.stop();
    }

}
