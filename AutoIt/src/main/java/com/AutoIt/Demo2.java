package com.AutoIt;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2{
	 public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://pdf2doc.com/");
	        WebElement btn=driver.findElement(By.xpath("(//span[@class=\"button__text\"])[1]"));
	        btn.click();
	        Thread.sleep(2000);
	        String file="C:\\Users\\gayat\\Desktop\\EXPLEO TRINING\\6_Arrays.pdf";
	        Robot r=new Robot();
	        StringSelection sel=new StringSelection(file);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        r.keyRelease(KeyEvent.VK_V);
	        Thread.sleep(2000);
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	 }
}
