package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RandomResult extends AbstractPage {

    @FindBy(tagName = "title")
    private WebElement title;

    public RandomResult(WebDriver driver) {
        super(driver);
    }

    public void displayTitle() {
        System.out.println(title);
    }
}
