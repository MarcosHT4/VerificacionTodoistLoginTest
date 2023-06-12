package execute;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Test
    public void verifyLoginTest() {
        mainPage.loginButton.click();
        loginPage.emailTextbox.setText("marcos@vpsitest.com");
        loginPage.passwordTextbox.setText("pole12345");
        loginPage.loginButton.click();
        Assertions.assertTrue(dashboardPage.upgradeProButtonLabel.isControlDisplayed(), "ERROR! El Login no pudo ser realizado");
    }




}
