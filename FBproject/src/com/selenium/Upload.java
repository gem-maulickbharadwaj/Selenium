package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maulick\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallseotools.com/plagiarism-checker/");
        WebElement uploads = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[1]/div/div[2]/form/div[1]/div/div[2]/div[1]/div/div/label/span[1]"));
        uploads.sendKeys("C:\\Users\\Maulick\\OneDrive\\Desktop\\testingbruh.txt");

    }
}