package tests;

import manager.MyDataProvider;
import models.CV;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateCv extends TestBase {
    @BeforeTest
    public void preCondition(){
        if(!TestBase.app.getHelperCv().isLogged()){
            TestBase.app.getHelperUser().logIn();
        }
    }

    @Test
    public void createCvTest(){
        CV cvHeader = CV.builder()
                .name("Winston")
                .country("USA")
                .email("winston@winston.co")
                .position("QA")
                .city("NY")
                .birthday("01.01.1995")
                .phone("8800963258")
                .build();
        TestBase.app.getHelperCv().CreateCv();
        TestBase.app.getHelperCv().fillHeaderForm(cvHeader);
        CV cvSummary =CV.builder().summary("dogs not friendly").build();
        TestBase.app.getHelperCv().fillSummaryForm(cvSummary);
        CV cvRelocation = CV.builder().relocation("Israel").build();
        TestBase.app.getHelperCv().fillRelocationForm(cvRelocation);
        CV cvShortDescription = CV.builder().ShortDescription("cat").build();
        TestBase.app.getHelperCv().fillShortDescriptionForm(cvShortDescription);
        CV cvSkills = CV.builder().title("Java").description("Java").build();
        TestBase.app.getHelperCv().fillSkillsForm(cvSkills);
        CV cvExperience = CV.builder()
                .startYear("2005")
                .endYear("2009")
                .companyName("OneLove")
                .companyLocation("NY")
                .companyUrl("ww.www.www")
                .positionExperience("QA")
                .aboutCompany("wow place")
                .build();
        TestBase.app.getHelperCv().fillExperienceForm(cvExperience);
        CV cvEducation = CV.builder()
                .startYearEducation("2001")
                .endYearEducation("2005")
                .instituteName("wow")
                .location("NY")
                .educationDescription("Wow")
                .build();
        TestBase.app.getHelperCv().fillEducationForm(cvEducation);
        CV cvOther = CV.builder()
                .titleOther("Super Cat")
                .descriptionOther("Winston")
                .build();
        TestBase.app.getHelperCv().fillOtherForm(cvOther);
        CV cvLinks = CV.builder().link("winston.com").build();
        TestBase.app.getHelperCv().fillLinksForm(cvLinks);
        TestBase.app.getHelperCv().saveCv();
        TestBase.app.getHelperUser().clickOnDashBoard();

    }
    @Test(dataProvider = "dataCreateCv",dataProviderClass = MyDataProvider.class)
    public void createCvTestDataProvider(CV cv){
        TestBase.app.getHelperCv().CreateCv();
        TestBase.app.getHelperCv().fillHeaderForm(cv);
        TestBase.app.getHelperCv().fillSummaryForm(cv);
        TestBase.app.getHelperCv().fillRelocationForm(cv);
        TestBase.app.getHelperCv().fillShortDescriptionForm(cv);
        TestBase.app.getHelperCv().fillSkillsForm(cv);
        TestBase.app.getHelperCv().fillExperienceForm(cv);
        TestBase.app.getHelperCv().fillEducationForm(cv);
        TestBase.app.getHelperCv().fillOtherForm(cv);
        TestBase.app.getHelperCv().fillLinksForm(cv);
        TestBase.app.getHelperCv().saveCv();
        TestBase.app.getHelperUser().clickOnDashBoard();
    }
    @Test(dataProvider = "dataCreateCv2",dataProviderClass = MyDataProvider.class)
    public void createCvTestDataProvider2(CV cv){
        TestBase.app.getHelperCv().CreateCv();
        TestBase.app.getHelperCv().fillHeaderForm(cv);
        TestBase.app.getHelperCv().fillSummaryForm(cv);
        TestBase.app.getHelperCv().fillRelocationForm(cv);
        TestBase.app.getHelperCv().fillShortDescriptionForm(cv);
        TestBase.app.getHelperCv().fillSkillsForm(cv);
        TestBase.app.getHelperCv().fillExperienceForm(cv);
        TestBase.app.getHelperCv().fillEducationForm(cv);
        TestBase.app.getHelperCv().fillOtherForm(cv);
        TestBase.app.getHelperCv().fillLinksForm(cv);
        TestBase.app.getHelperCv().saveCv();
        TestBase.app.getHelperUser().clickOnDashBoard();
    }

}
