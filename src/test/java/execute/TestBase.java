package execute;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoist.DashboardPage;
import pages.todoist.LoginPage;
import pages.todoist.MainPage;
import singletonSession.Session;

public class TestBase {

    protected MainPage mainPage = new MainPage();
    protected LoginPage loginPage = new LoginPage();
    protected DashboardPage dashboardPage = new DashboardPage();

    @BeforeEach
    public void openBroswer() {
        Session.getSession().goTo("https://todoist.com/");
    }

    @AfterEach
    public void closeBroswer() {

        Session.getSession().closeBrowser();

    }


}
