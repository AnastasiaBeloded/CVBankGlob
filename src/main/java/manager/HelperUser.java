package manager;

import models.CV;
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

    public void CreateCv() {
        wd.findElement(By.xpath("//span[normalize-space()='Create CV']")).click();
    }
    public void fillHeaderForm(CV cvHeader){
        wd.findElement(By.xpath("//section[@id='header']//div[@class='cover']")).click();
        type(By.xpath("//input[@id='name']"),cvHeader.name);
        type(By.xpath("//input[@id='country']"),cvHeader.country);
        type(By.xpath("//input[@id='email']"),cvHeader.email);
        type(By.xpath("//input[@id='position']"),cvHeader.position);
        type(By.xpath("//input[@id='city']"),cvHeader.city);
        type(By.xpath("//input[@id='birthday']"),cvHeader.birthday);
        type(By.xpath("//input[@id='phone']"),cvHeader.phone);
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();

    }
    public boolean isLogged(){
        return isElementPresent(By.xpath("//button[@class='mat-focus-indicator " +
                "logout-btn mat-button mat-button-base ng-star-inserted']//span[@class='mat-button-wrapper']"));

    }
    public void logIn(){
        openLoginFormSignInButton();
        fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        login();
    }

    public void fillSummaryForm(CV cvSummary){
        wd.findElement(By.xpath("//span[@class='mat-ripple summary selected']//div[@class='cover']")).click();
        type(By.xpath("//textarea[@id='summary']"),cvSummary.getSummary());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();
    }
    public void fillRelocationForm(CV cvRelocation){
        wd.findElement(By.xpath("//span[@class='mat-ripple relocation selected']//div[@class='cover']")).click();
        type(By.xpath("//input[@id='relocation']"),cvRelocation.getRelocation());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();
    }
    public void fillShortDescriptionForm(CV cvShortDescription){
        wd.findElement(By.xpath("//div[@class='mat-ripple selected']//div[@class='cover']")).click();
        type(By.cssSelector("#shortDesc"),cvShortDescription.getShortDescription());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();
    }
    public void fillSkillsForm(CV cvSkills){
        wd.findElement(By.xpath("//section[@id='skills']//div[@class='cover']")).click();
        wd.findElement(By.xpath("//button[@class='mat-focus-indicator add-row-btn " +
                "mat-stroked-button mat-button-base']//span[@class='mat-button-wrapper']")).click();
        type(By.xpath("//input[@id='title_0']"),cvSkills.getTitle());
        type(By.xpath("//input[@id='desc_0']"),cvSkills.getDescription());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();

    }
    public void fillExperienceForm(CV cvExperience){
        wd.findElement(By.xpath("//section[@id='experience']//div[@class='cover']")).click();
        type(By.xpath("//input[@id='startDate']"),cvExperience.getStartYear());
        type(By.xpath("//input[@id='endDate']"),cvExperience.getEndYear());
        type(By.xpath("//input[@id='companyName']"),cvExperience.getCompanyName());
        type(By.xpath("//input[@id='companyLocation']"),cvExperience.getCompanyLocation());
        type(By.xpath("//input[@id='url']"),cvExperience.getCompanyUrl());
        type(By.xpath("//input[@id='position']"),cvExperience.getPositionExperience());
        type(By.xpath("//textarea[@id='description']"),cvExperience.getAboutCompany());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();

    }
    public void fillEducationForm(CV cvEducation){
        wd.findElement(By.xpath("//section[@id='education']//div[@class='cover']")).click();
        type(By.xpath("//input[@id='startDate']"),cvEducation.getStartYearEducation());
        type(By.xpath("//input[@id='endDate']"),cvEducation.getEndYearEducation());
        type(By.xpath("//input[@id='title']"),cvEducation.getInstituteName());
        type(By.xpath("//input[@id='location']"),cvEducation.getLocation());
        type(By.xpath("//input[@id='description']"),cvEducation.getEducationDescription());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();
    }
    public void fillOtherForm(CV cvOther){
        wd.findElement(By.xpath("//section[@id='other']//div[@class='cover']")).click();
        type(By.xpath("//input[@id='title1']"),cvOther.getTitleOther());
        type(By.xpath("//input[@id='desc1']"),cvOther.getDescriptionOther());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();

    }
    public void fillLinksForm(CV cvLinks){
        wd.findElement(By.xpath("//section[@id='link']//div[@class='cover']")).click();
        type(By.xpath("//input[@id='link1']"),cvLinks.getLink());
        wd.findElement(By.xpath("//span[normalize-space()='Save']")).click();

    }
    public void saveCv(){
        wd.findElement(By.xpath("//mat-icon[normalize-space()='save']")).click();
    }




}
