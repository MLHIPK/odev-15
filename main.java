package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //1.Örnek
        String url ="https://demoqa.com/elements";
        System.setProperty("webdriver.edge.driver","C:\\EdgeDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement button1 = driver.findElement(By.xpath("//li[@id='item-4']"));
        button1.click();
        WebElement button = driver.findElement(By.xpath("//div[@class='mt-4']/following::button"));
        button.sendKeys(Keys.ENTER);
        WebElement metin = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
        metin.getText();
        System.out.println(metin.getText());

        //2.Örnek
        String url2 ="https://demoqa.com/webtables";
        driver.get(url2);
        WebElement add = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        add.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Meliha");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("İpek");
        WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail.sendKeys("pekm.3366@gmail.com");
        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.sendKeys("33");
        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.sendKeys("40000");
        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.sendKeys("Destek Uzmanı");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        WebElement edit = driver.findElement(By.xpath("//span[@id='edit-record-4']"));
        edit.click();
        WebElement emailEdit = driver.findElement(By.xpath(""//input[@id='userEmail']"));
        emailEdit.clear();
        emailEdit.sendKeys("pekm.3366@gmail.com");
        driver.close();
    }
}
