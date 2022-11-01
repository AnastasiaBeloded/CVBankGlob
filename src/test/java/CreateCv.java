import models.CV;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateCv extends TestBase{
    @BeforeTest
    public void preCondition(){
        if(!app.getHelperCv().isLogged()){
            app.getHelperUser().logIn();
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
        app.getHelperCv().CreateCv();
        app.getHelperCv().fillHeaderForm(cvHeader);
        CV cvSummary =CV.builder().summary("dogs not friendly").build();
        app.getHelperCv().fillSummaryForm(cvSummary);
        CV cvRelocation = CV.builder().relocation("Israel").build();
        app.getHelperCv().fillRelocationForm(cvRelocation);
        CV cvShortDescription = CV.builder().ShortDescription("cat").build();
        app.getHelperCv().fillShortDescriptionForm(cvShortDescription);
        CV cvSkills = CV.builder().title("Java").description("Java").build();
        app.getHelperCv().fillSkillsForm(cvSkills);
        CV cvExperience = CV.builder()
                .startYear("2005")
                .endYear("2009")
                .companyName("OneLove")
                .companyLocation("NY")
                .companyUrl("ww.www.www")
                .positionExperience("QA")
                .aboutCompany("wow place")
                .build();
        app.getHelperCv().fillExperienceForm(cvExperience);
        CV cvEducation = CV.builder()
                .startYearEducation("2001")
                .endYearEducation("2005")
                .instituteName("wow")
                .location("NY")
                .educationDescription("Wow")
                .build();
        app.getHelperCv().fillEducationForm(cvEducation);
        CV cvOther = CV.builder()
                .titleOther("Super Cat")
                .descriptionOther("Winston")
                .build();
        app.getHelperCv().fillOtherForm(cvOther);
        CV cvLinks = CV.builder().link("winston.com").build();
        app.getHelperCv().fillLinksForm(cvLinks);
        app.getHelperCv().saveCv();

    }

}
