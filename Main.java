package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        startTest();

        testActions("table");
        timeout(1000);

        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for(int i= 0; i < ids.length; i++) {
            try {
                driver.findElement(By.cssSelector(".adult-container"));
                driver.findElement(By.id("i-am-adult")).click();
                driver.findElement(By.cssSelector("#selectboxCategory span")).click();
                driver.findElement(By.cssSelector("[data-category=\"" + ids[i] + "\"]")).click();
            } catch(Exception e) {
                System.out.println("Error");
                driver.findElement(By.cssSelector("#selectboxCategory span")).click();
                driver.findElement(By.cssSelector("[data-category=\"" + ids[i] + "\"]")).click();
            }
        }
    }
        public static void startTest() {

            driver.get("example website");

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.id("onetrust-accept-btn-handler")
                    )
            );
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        }
    public static void testActions(String phrase) {
        driver.findElement(By.id("searchKeyword")).clear();
        driver.findElement(By.id("searchKeyword")).sendKeys(phrase);

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("searchButton")
                )
        );

        driver.findElement(By.id("searchButton")).click();
    }
    public static void timeout(int time) {
        try {
            Thread.sleep(time);
        } catch(Exception e) {
        }
    }
}

