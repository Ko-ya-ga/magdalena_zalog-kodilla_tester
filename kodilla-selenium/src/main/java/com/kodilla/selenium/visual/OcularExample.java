package com.kodilla.selenium.visual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\Chrome\\chromedriver.exe");        // [1]
        WebDriver webDriver = new ChromeDriver();

        /* Ocular.config()
                .resultPath(Paths.get("C:\\Ocular\\results"))
                .snapshotPath(Paths.get("C:\\Ocular\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);

        page.open();
        page.compare();
        page.close(); */
    }
}
