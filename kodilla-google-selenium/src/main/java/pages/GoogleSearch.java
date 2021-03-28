package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {
    @FindBy(css = "input[title='Szukaj']")
    static WebElement inputField;

    @FindBy(xpath = "//*[@id=\"introAgreeButton\"]/span/span")
    static WebElement agreeButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mobile-promo/div/div/div/div[2]/g-flat-button")
    static WebElement closeButton;

    @FindBy(css = "input[value='Szukaj w Google']")
    static List<WebElement> searchButton;
    private static GoogleResults googleResults;
    private static RandomResult randomResult;

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        closeButton.click();
        driver.switchTo().frame(0);
        WebDriverWait waitForAgreeButton = new WebDriverWait(driver, 10);
        waitForAgreeButton.until(ExpectedConditions.elementToBeClickable(agreeButton)).click();
        driver.switchTo().defaultContent();
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);                          // [2]
        googleResults.iSeeResults();
        randomResult = googleResults.getRandomResult(driver);
        randomResult.displayTitle();
    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
