package com.webtest;

import org.testng.annotations.Test;

import webtest.AdminLoginPage;

import org.testng.annotations.BeforeMethod;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NaverMailSend {
	
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
	 
	 AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
	 adminLoginPage.login();
	 
	 //	���� ��ư ã�� �� ��ưŬ��
	 WebElement MailSendButton = driver.findElement(By.className("MyView-module__item_text___VTQQM"));
	 MailSendButton.click();
	
	 
	 
	 // �����ۼ��̵� ��ư ã�� �� �����ۼ��̵� Ŭ��
	 WebElement MailWriteMoveButton = driver.findElement(By.linkText("���Ͼ���"));
	 MailWriteMoveButton.click();

	 
	 
	  Object[] windowHandles=driver.getWindowHandles().toArray();
	  
	  //  ���Ͼ��� ��ư Ŭ�� ��, ��â���� �̵��Ѵ�. 
	  //  ��â���� �̵��ؼ� ������Ʈ ��ȸ�� ��â������ ����� �̵��� �ʿ��ϴ�.
	  //  �̵��� �������� ��, ��ȸ�� ����â���� ��ȸ�� �̷���� ������Ʈ�� ã�� ���ϰ� �ȴ�. [0]���� [1]�� â 
	  driver.switchTo().window((String) windowHandles[1]);
	
	 // ���� �޴»��
	 WebElement SendTo = driver.findElement(By.id("recipient_input_element"));
	 SendTo.click();
	 SendTo.sendKeys("lju1113@naver.com");
	 
	 
	 // ���� ����
	 WebElement Title = driver.findElement(By.id("subject_title"));
	 Title.click();
	 Title.sendKeys("�׽�Ʈ ���� �Դϴ�.");

	 
	  // ���� ����
	  driver.switchTo().frame(4); // �ټ���° ���������� �̵�

	  WebElement Content = driver.findElement(By.className("workseditor-content"));
	  Content.sendKeys("���� �׽�Ʈ ���� �Դϴ�.");
	  driver.switchTo().defaultContent(); // ���� ���������� �̵� 
	
	  
	  
	  // ���� ������ ��ư
	  WebElement SendButton = driver.findElement(By.className("button_write_task"));
	  SendButton.click();
	
	
	 
	 
	 
 }


 @AfterMethod
 public void afterMethod() {

 }

}
