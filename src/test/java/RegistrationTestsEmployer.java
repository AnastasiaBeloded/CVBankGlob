import models.EmployerUser;
import org.testng.annotations.Test;


public class RegistrationTestsEmployer extends TestBase{
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
        app.getHelperUser().fillSignUpFormRegistration(employerUser);
        app.getHelperUser().signUpEmployer();
        app.getHelperUser().navigate("https://cvbank-main-backend-dev-mkwwqqcvpq-uc.a.run.app/v1/user/validation/allanteone+3@gmail.com/2062a161-7419-44b8-988e-f4fc776c6d23");
        app.getHelperUser().signIn();
        app.getHelperUser().fillLoginRegFormEmployer("allanteone+3@gmail.com", "John6669");
        app.getHelperUser().login();


    }

}
