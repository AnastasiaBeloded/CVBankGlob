package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperUser extends HelperBase {

    public HelperUser(WebDriver wd) {
        super(wd);
    }


    public void openLoginFormSignInButton() {
        wd.navigate().to("https://cv-bank-new.web.app/signin");
    }
    public void fillLoginForm(String email, String password) {
        type(By.xpath("//input[@id='email']"), email);
        type(By.cssSelector("#password"), password);

    }
    public void login() {
        /*new WebDriverWait(wd, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(wd.findElement(By.cssSelector("button[type='submit']"))));*/
        wd.findElement(By.xpath("//span[normalize-space()='log in']")).click();
    }
    public void logout(){
        wd.findElement(By.xpath("//button[@class='mat-focus-indicator logout-btn mat-button mat-button-base ng-star-inserted']//span[@class='mat-button-wrapper']")).click();
    }

    public void openLoginFormCreateCVButton() {
        wd.navigate().to("https://cv-bank-new.web.app/create");
        wd.findElement(By.xpath("//span[normalize-space()='sign in']")).click();

    }
    public void openloginFormForEmployerButton() {
        wd.navigate().to("https://cv-bank-new.web.app/employer");
        wd.findElement(By.xpath("//span[normalize-space()='sign in']")).click();

    }
    public void fillLoginFormEmployer(String email, String password) {
        type(By.xpath("(//input[@id='email'])[2]"), email);
        type(By.xpath("(//input[@id='password'])[2]"), password);

    }





}
