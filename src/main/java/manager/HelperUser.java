package manager;

import models.EmployerUser;
import models.User;
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
    public void openLoginFormForEmployerButton() {
        wd.navigate().to("https://cv-bank-new.web.app/employer");
        wd.findElement(By.xpath("//span[normalize-space()='sign in']")).click();

    }
    public void fillLoginFormEmployer(String email, String password) {
        type(By.xpath("(//input[@id='email'])[2]"), email);
        type(By.xpath("(//input[@id='password'])[2]"), password);

    }
    public void openLoginFormHireNowButton(){
        wd.navigate().to("https://cv-bank-new.web.app/employer");
        wd.findElement(By.xpath("//span[normalize-space()='sign in']")).click();
    }

    public void openSignUpForm(){
        openLoginFormSignInButton();
        wd.findElement(By.xpath("//mat-icon[normalize-space()='close']")).click();
        wd.findElement(By.xpath("//span[normalize-space()='sign up']")).click();
    }
    public void fillSignUpForm(User user){
        type(By.xpath("//input[@id='name']"),user.getName());
        type(By.xpath("//input[@id='lastName']"),user.getLastName());
        type(By.xpath("//input[@id='email']"),user.getEmail());
        type(By.xpath("//input[@id='password']"),user.getPassword());
        type(By.xpath("//input[@id='confirmPassword']"),user.getConfirmPassword());

    }

    public void signUp(){
        wd.findElement(By.xpath("(//span[@class='mat-button-wrapper'][normalize-space()='sign up'])[2]")).click();
        pause(1500);
    }
    public void fillSignUpFormRegistration(EmployerUser employerUser){
        wd.navigate().to("https://cv-bank-new.web.app/employer");
        type(By.xpath("//input[@id='companyName']"),employerUser.getCompanyName());
        type(By.xpath("//input[@id='companyWebsite']"),employerUser.getCompanyWebsite());
        type(By.xpath("//input[@id='country']"),employerUser.getCountry());
        type(By.xpath("//input[@id='city']"),employerUser.getCity());
        type(By.xpath("//input[@id='street']"),employerUser.getStreet());
        type(By.xpath("//input[@id='house']"),employerUser.getHouse());
        type(By.xpath("//input[@id='zip']"),employerUser.getPostcode());
        type(By.xpath("//input[@id='companyPhone']"),employerUser.getCompanyPhone());
        type(By.xpath("//input[@id='name']"),employerUser.getApplicantName());
        type(By.xpath("//input[@id='lastName']"),employerUser.getApplicantLastName());
        type(By.xpath("//input[@id='position']"),employerUser.getPosition());
        type(By.xpath("//input[@id='phone']"),employerUser.getPhone());
        type(By.xpath("//input[@id='email']"),employerUser.getCorporativeEmail());
        type(By.xpath("//input[@id='password']"),employerUser.getPassword());
        type(By.xpath("//input[@id='confirmPassword']"),employerUser.getConfirmPassword());


    }
    public void signUpEmployer(){
        wd.findElement(By.xpath("//span[normalize-space()='sign up']")).click();
        pause(1500);
    }
    public void signIn(){
        wd.findElement(By.xpath("//span[normalize-space()='sign in']")).click();

    }
    public void fillLoginRegFormEmployer(String email,String password){
        type(By.xpath("//input[@id='email']"), email);
        type(By.xpath("//input[@id='password']"), password);

    }






}
