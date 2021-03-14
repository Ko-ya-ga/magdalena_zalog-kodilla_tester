package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement category = driver.findElement(By.cssSelector("#gh-cat"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(11);

        WebElement inputField = driver.findElement(By.cssSelector("#gh-ac"));
        inputField.sendKeys("Laptop");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#srp-river-results > ul > li:nth-child(2)")));

        List<WebElement> elements = driver.findElements(By.cssSelector("#srp-river-results > ul"));

        String productInformation = elements.get(0).getText();
        System.out.println(productInformation);
    }
}
