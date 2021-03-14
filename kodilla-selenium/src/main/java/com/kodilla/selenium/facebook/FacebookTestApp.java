package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement agreeButton = driver.findElement(By.cssSelector("input[title='Akceptuj wszystkie']"));
        agreeButton.submit();

        WebElement yearCombo = driver.findElement(
                By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));

        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}
