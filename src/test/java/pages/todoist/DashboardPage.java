package pages.todoist;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class DashboardPage {

    public Label upgradeProButtonLabel = new Label(By.xpath("//button[@data-testid='upgrade-button-top-bar']//span[contains(text(),'Actualizar')]"));

}
