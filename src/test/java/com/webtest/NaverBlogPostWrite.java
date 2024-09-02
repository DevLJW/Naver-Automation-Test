package com.webtest;

import org.testng.annotations.Test;

import webtest.AdminLoginPage;

import org.testng.annotations.BeforeMethod;

import java.awt.Desktop.Action;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NaverBlogPostWrite {
	
	 WebDriver driver; 	// ������ �� ����̹�

	
	 @BeforeMethod
	  public void beforeMethod() {
		  
		// ũ�ҵ���̹� ����� ����
		   System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
			
		// ũ�� ����̹� �ν��Ͻ��� �ʱ�ȭ
		   driver = new ChromeDriver();
		   
		// ����� ���
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  }
	
	
  @Test
  public void Run() throws InterruptedException, UnsupportedFlavorException, IOException {
	  
	  // �α��� ������ ��ü ���� �� ����
	  AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
      adminLoginPage.login();
     
 	 //	��α� �� ���� ��ư
 	 WebElement BlogTabOpenButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/ul/li[3]/a/span"));
 	 BlogTabOpenButton.click();
 
 	 // ��α� �Խñ� �ۼ� �̵� ��ư
  	 WebElement BlogPostWriteMoveButton = driver.findElement(By.linkText("�۾���"));
   	 BlogPostWriteMoveButton.click();

  	
  	 
  	  // ��â���� �̵��ؼ� ������Ʈ ��ȸ�� ��â������ ����� �̵��� �ʿ��ϴ�.
 	  // �̵��� �������� ��, ��ȸ�� ����â���� ��ȸ�� �̷���� ������Ʈ�� ã�� ���ϰ� �ȴ�. [0]���� [1]�� â 
  	 Object[] windowHandles=driver.getWindowHandles().toArray();
  	 driver.switchTo().window((String) windowHandles[1]);

  	
 	driver.switchTo().frame("mainFrame");
 	
    // ��α� �Խñ� ���� ��ư Ŭ��

 	
	WebElement PlaceHolder= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[2]/section/article/div[1]/div[1]/div/div/p"));	
	
	PlaceHolder.click();

	Actions actions = new Actions(driver);
	actions.sendKeys(PlaceHolder,"����Ʈ ���� �Դϴ�.").perform();
	
	
	
	
 	// ���� �Ӽ� �� ����
 	WebElement TextDesignButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[1]/div/button"));
 	TextDesignButton.click();
	
 	// ���� �Ӽ� �� ����
 	WebElement TextDesignButton1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[1]/div/div/button[9]"));
 	TextDesignButton1.click();
 
 	
 	
 
 	// ���� ũ�� �� ����
 	WebElement TextSizeTab = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[2]/div/button"));
 	TextSizeTab.click();

 	
 	// ���� ũ�� �� ����
 	WebElement TextSizeSelect = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[2]/div/div/button[3]"));
 	TextSizeSelect.click();
 
 	
 	
    // ��α� ���� ��ư Ŭ��
 	
 	
 	
 	WebElement ContentPlaceHolder = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[2]/section/article/div[2]/div/div/div/div/p"));	
 	ContentPlaceHolder.click();
 	
 	
	actions.sendKeys(ContentPlaceHolder,"����Ʈ ���� �Դϴ�.").perform();
 	
 	


	
	// ���� ��ư Ŭ��
	WebElement WriteButton = driver.findElement(By.className("publish_btn__m9KHH"));

	 
	//Ŭ�� ��, ���
	((JavascriptExecutor)driver).executeScript("arguments[0].click() ", WriteButton);

	 
	 // �����ϱ�
	 WebElement WriteButtonOK = driver.findElement(By.className("confirm_btn__WEaBq"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click() ", WriteButtonOK);

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 
	
	
	
	
	

 	
 	
 	
	
	

 	
 	
 	
 	
 	
 	

  	 
  	

  	 
  	 
  	 
  	
  
 	 
 	 
      
      
	  
	  
	  
	  
	  
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
