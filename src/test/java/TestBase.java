import manager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
   protected static  ApplicationManager app = new ApplicationManager();



    @BeforeMethod
    public void preCondition() {
        app.init();
    }
    @AfterMethod
    public void tearDown(){
      //  app.stop();
    }

}
