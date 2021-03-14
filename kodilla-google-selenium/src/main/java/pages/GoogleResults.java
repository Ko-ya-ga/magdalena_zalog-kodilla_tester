package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);// [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public RandomResult getRandomResult(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(results));
        Random random = new Random();
        int i = random.nextInt(results.size());
        results.get(i).click();
        RandomResult randomResult = new RandomResult(driver);
        return randomResult;
    }
}
