package com.AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo3 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/upload-download");
	WebElement ele=driver.findElement(By.xpath("//input[@id=\"uploadFile\"]"));
	ele.sendKeys("C:\\\\Users\\\\gayat\\\\Desktop\\\\EXPLEO TRINING\\\\6_Arrays.pdf");
}
}
