package tests;

import manager.MyDataProvider;
import models.EmployerUser;
import org.testng.annotations.Test;


public class RegistrationTestsEmployer extends TestBase {
    @Test

    public void registrationSuccessForEmployerButton() {
        int i = (int) System.currentTimeMillis() / 1000 % 3600;
        EmployerUser employerUser = EmployerUser.builder()
                .companyName("Impalus")
                .companyWebsite("www.impalus.com")
                .country("USA")
                .city("Washington")
                .street("123")
                .house("765")
                .postcode("879845")
                .companyPhone("9050789314")
                .applicantName("John")
                .applicantLastName("Joe")
                .position("Team Leader")
                .phone("8058327546")
                .corporativeEmail("allanteone"+i+"@gmail.com")
                .password("John6669")
                .confirmPassword("John6669")
                .build();
        TestBase.app.getHelperUser().fillSignUpFormRegistration(employerUser);
        TestBase.app.getHelperUser().signUpEmployer();
        TestBase.app.getHelperUser().navigate("https://cvbank-main-backend-dev-mkwwqqcvpq-uc.a.run.app/v1/user/validation/allanteone+3@gmail.com/2062a161-7419-44b8-988e-f4fc776c6d23");
        TestBase.app.getHelperUser().signIn();
        TestBase.app.getHelperUser().fillLoginRegFormEmployer("allanteone+3@gmail.com", "John6669");
        TestBase.app.getHelperUser().login();


    }
    @Test
    public void registrationSuccessForEmployerHireNowButton(){
        int i = (int) System.currentTimeMillis() / 1000 % 3600;
        EmployerUser employerUser = EmployerUser.builder()
                .companyName("Impalus")
                .companyWebsite("www.impalus.com")
                .country("USA")
                .city("Washington")
                .street("123")
                .house("765")
                .postcode("879845")
                .companyPhone("9050789314")
                .applicantName("John")
                .applicantLastName("Joe")
                .position("Team Leader")
                .phone("8058327546")
                .corporativeEmail("allanteone"+i+"@gmail.com")
                .password("John6669")
                .confirmPassword("John6669")
                .build();
        TestBase.app.getHelperUser().fillSignUpFormRegistration(employerUser);
        TestBase.app.getHelperUser().signUpEmployer();
        TestBase.app.getHelperUser().navigate("https://cvbank-main-backend-dev-mkwwqqcvpq-uc.a.run.app/v1/user/validation/allanteone+3@gmail.com/2062a161-7419-44b8-988e-f4fc776c6d23");
        TestBase.app.getHelperUser().signIn();
        TestBase.app.getHelperUser().fillLoginRegFormEmployer("allanteone+3@gmail.com", "John6669");
        TestBase.app.getHelperUser().login();

    }
    @Test(dataProvider = "dataRegistration",dataProviderClass = MyDataProvider.class)
    public void registrationSuccessForEmployerHireNowButtonDP(EmployerUser user){
        TestBase.app.getHelperUser().fillSignUpFormRegistration(user);
        TestBase.app.getHelperUser().signUpEmployer();
        TestBase.app.getHelperUser().navigate("https://cvbank-main-backend-dev-mkwwqqcvpq-uc.a.run.app/v1/user/validation/allanteone+3@gmail.com/2062a161-7419-44b8-988e-f4fc776c6d23");
        TestBase.app.getHelperUser().signIn();
        TestBase.app.getHelperUser().fillLoginRegFormEmployer("allanteone+3@gmail.com", "John6669");
        TestBase.app.getHelperUser().login();
    }


}
