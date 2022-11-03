package tests;

import models.User;
import org.testng.annotations.Test;

public class RegistrationTestsSeeker extends TestBase {

    @Test
    public void registrationSuccessSignInButton(){
        int i = (int)System.currentTimeMillis()/1000%3600;
        
        User user = new User("Noa", "Mio","mia"+i+"@gmail.com","Bio12345$","Bio12345$");
        TestBase.app.getHelperUser().openSignUpForm();
        TestBase.app.getHelperUser().fillSignUpForm(user);
        TestBase.app.getHelperUser().signUp();
        TestBase.app.getHelperUser().fillLoginForm("nastenabeloded@gmail.com", "Winston08");
        TestBase.app.getHelperUser().login();


    }

}
