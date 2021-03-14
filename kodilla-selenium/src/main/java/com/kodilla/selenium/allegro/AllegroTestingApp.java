package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement category = driver.findElement(By.xpath("/html/body/div[3]/div[5]/header/div/div/div[1]/div/form/div[2]/div/select"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(2);

        WebElement inputField = driver.findElement(By.xpath("/html/body/div[3]/div[5]/header/div/div/div[1]/div/form/input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
