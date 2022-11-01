package manager;

import models.CV;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperCv extends HelperBase{
    public HelperCv(WebDriver wd) {
        super(wd);
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
        WebElement element = wd.findElement(By.xpath("//input[@id='startDate']"));
        element.click();
        element.sendKeys(cvExperience.getStartYear(), Keys.CONTROL,"a",Keys.DELETE);
        type(By.xpath("//input[@id='startDate']"),cvExperience.getStartYear());
        WebElement element1 = wd.findElement(By.xpath("//input[@id='endDate']"));
        element1.click();
        element1.sendKeys(cvExperience.getEndYear(),Keys.CONTROL,"a",Keys.DELETE);
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
        WebElement element2 = wd.findElement(By.xpath("//input[@id='startDate']"));
        element2.click();
        element2.sendKeys(cvEducation.getStartYearEducation(),Keys.CONTROL,"a",Keys.DELETE);
        type(By.xpath("//input[@id='startDate']"),cvEducation.getStartYearEducation());
        WebElement element1 = wd.findElement(By.xpath("//input[@id='endDate']"));
        element1.click();
        element1.sendKeys(cvEducation.getEndYearEducation(),Keys.CONTROL,"a",Keys.DELETE);
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
