package manager;

import com.google.common.io.Files;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd){
        this.wd = wd;
    }

    public void type(By locator, String text) {
        if (text != null) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            pause(500);
            element.sendKeys(text);
        }
    }
        public void pause ( int time){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        public void navigate(String url){
        wd.navigate().to(url);
        }
    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;

    }
    public void close(){
        wd.findElement(By.xpath("//mat-icon[normalize-space()='close']")).click();
    }
    public void takeScreenShots(String pathToFile) {
        File tmp = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        File screen = new File(pathToFile);

        try {
            Files.copy(tmp, screen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

