package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    WebDriver browser;

    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeD\\chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");

    }

    @Test
    public void testOne() {
        WebElement checkBox = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[3]/div/label/input"));
        checkBox.click();

        WebElement inputNumber = browser.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
        inputNumber.sendKeys("9");

        WebElement inputAnswer = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div/input"));
        inputAnswer.sendKeys("A");

        WebElement inputDate = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div/input[1]"));
        inputDate.sendKeys("06052020");

        WebElement rating = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[5]/div/div[2]/div/div/div[4]/span"));
        rating.click();

        WebElement radioButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[6]/div/div[2]/div/div[1]/div/label/input"));
        radioButton.click();

        WebElement submitButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        submitButton.click();
    }

    @Test
    public void testTwo() {
        WebElement checkBox = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/label/input"));
        checkBox.click();

        WebElement inputNumber = browser.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
        inputNumber.sendKeys("10");

        WebElement inputAnswer = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div/input"));
        inputAnswer.sendKeys("B");

        WebElement inputDate = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div/input[1]"));
        inputDate.sendKeys("12122012");

        WebElement rating = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[5]/div/div[2]/div/div/div[5]/span"));
        rating.click();

        WebElement radioButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[6]/div/div[2]/div/div[1]/div/label/input"));
        radioButton.click();

        WebElement submitButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        submitButton.click();
    }

    @Test
    public void testThree() {
        WebElement checkBox = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[3]/div/label/input"));
        checkBox.click();

        WebElement inputNumber = browser.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
        inputNumber.sendKeys("6");

        WebElement inputAnswer = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div/input"));
        inputAnswer.sendKeys("C");

        WebElement inputDate = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div/input[1]"));
        inputDate.sendKeys("11112011");

        WebElement rating = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[5]/div/div[2]/div/div/div[4]/span"));
        rating.click();

        WebElement radioButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[6]/div/div[2]/div/div[2]/div/label/input"));
        radioButton.click();

        WebElement submitButton = browser.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        submitButton.click();
    }

    @AfterEach
    public void closeBrowser(){
        browser.close();
    }
}


