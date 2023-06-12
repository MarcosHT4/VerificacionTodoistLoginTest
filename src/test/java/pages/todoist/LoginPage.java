package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextbox = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordTextbox = new TextBox(By.xpath("//input[@type='password']"));
    public Button loginButton = new Button(By.xpath("//button[@data-gtm-id]"));
}
