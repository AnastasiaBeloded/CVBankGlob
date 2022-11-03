package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;
    HelperUser helperUser;
    HelperCv helperCv;
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
    String browser;

    public ApplicationManager(String browser){
        this.browser=browser;
    }

    public void init(){
        if(browser.equals(Browser.CHROME.browserName())){
            wd = new ChromeDriver();
        }else if(browser.equals(Browser.FIREFOX.browserName())){
            wd= new FirefoxDriver();
        }

        WebDriverListener listener = new MyListener();
        wd = new EventFiringDecorator(listener).decorate(wd);
        logger.info("All tests run in chrome browser");
        wd.navigate().to("https://www.gcvbank.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Current Url---->"+wd.getCurrentUrl());
        helperUser=new HelperUser(wd);
        helperCv = new HelperCv(wd);
    }


    /* public void stop(){
        wd.quit();

}*/

    public HelperUser getHelperUser() {
        return helperUser;
    }
    public HelperCv getHelperCv(){
        return helperCv;
    }
}
