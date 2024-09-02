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
	
	 WebDriver driver; 	// 셀레늄 웹 드라이버

	  @BeforeMethod
	  public void beforeMethod() {
		  
		// 크롬드라이버 사용경로 설정
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\qatest\\src\\test\\resources\\chromedriver-win64/chromedriver.exe");
		
		// 크롬 드라이버 인스턴스로 초기화
	    driver = new ChromeDriver();
	    // 명시적 대기
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	    
	  }
	
 @Test
 public void Run() throws InterruptedException, UnsupportedFlavorException, IOException {
	 
	 AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
	 adminLoginPage.login();
	 
	 //	메일 버튼 찾기 및 버튼클릭
	 WebElement MailSendButton = driver.findElement(By.className("MyView-module__item_text___VTQQM"));
	 MailSendButton.click();
	
	 
	 
	 // 메일작성이동 버튼 찾기 및 메일작성이동 클릭
	 WebElement MailWriteMoveButton = driver.findElement(By.linkText("메일쓰기"));
	 MailWriteMoveButton.click();

	 
	 
	  Object[] windowHandles=driver.getWindowHandles().toArray();
	  
	  //  메일쓰기 버튼 클릭 시, 새창으로 이동한다. 
	  //  새창으로 이동해서 엘레멘트 조회시 새창으로의 제어권 이동이 필요하다.
	  //  이동을 하지않을 시, 조회는 기존창에서 조회가 이루어져 엘레멘트를 찾지 못하게 된다. [0]기존 [1]새 창 
	  driver.switchTo().window((String) windowHandles[1]);
	
	 // 메일 받는사람
	 WebElement SendTo = driver.findElement(By.id("recipient_input_element"));
	 SendTo.click();
	 SendTo.sendKeys("lju1113@naver.com");
	 
	 
	 // 메일 제목
	 WebElement Title = driver.findElement(By.id("subject_title"));
	 Title.click();
	 Title.sendKeys("테스트 제목 입니다.");

	 
	  // 메일 내용
	  driver.switchTo().frame(4); // 다섯번째 프레임으로 이동

	  WebElement Content = driver.findElement(By.className("workseditor-content"));
	  Content.sendKeys("메일 테스트 내용 입니다.");
	  driver.switchTo().defaultContent(); // 기존 프레임으로 이동 
	
	  
	  
	  // 메일 보내기 버튼
	  WebElement SendButton = driver.findElement(By.className("button_write_task"));
	  SendButton.click();
	
	
	 
	 
	 
 }


 @AfterMethod
 public void afterMethod() {

 }

}
