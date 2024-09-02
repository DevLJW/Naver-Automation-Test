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
	  
	  // 로그인 페이지 객체 패턴 및 실행
	  AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
      adminLoginPage.login();
     
 	 //	블로그 탭 오픈 버튼
 	 WebElement BlogTabOpenButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/ul/li[3]/a/span"));
 	 BlogTabOpenButton.click();
 
 	 // 블로그 게시글 작성 이동 버튼
  	 WebElement BlogPostWriteMoveButton = driver.findElement(By.linkText("글쓰기"));
   	 BlogPostWriteMoveButton.click();

  	
  	 
  	  // 새창으로 이동해서 엘레멘트 조회시 새창으로의 제어권 이동이 필요하다.
 	  // 이동을 하지않을 시, 조회는 기존창에서 조회가 이루어져 엘레멘트를 찾지 못하게 된다. [0]기존 [1]새 창 
  	 Object[] windowHandles=driver.getWindowHandles().toArray();
  	 driver.switchTo().window((String) windowHandles[1]);

  	
 	driver.switchTo().frame("mainFrame");
 	
    // 블로그 게시글 제목 버튼 클릭

 	
	WebElement PlaceHolder= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[2]/section/article/div[1]/div[1]/div/div/p"));	
	
	PlaceHolder.click();

	Actions actions = new Actions(driver);
	actions.sendKeys(PlaceHolder,"포스트 제목 입니다.").perform();
	
	
	
	
 	// 글자 속성 탭 열기
 	WebElement TextDesignButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[1]/div/button"));
 	TextDesignButton.click();
	
 	// 글자 속성 탭 선택
 	WebElement TextDesignButton1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[1]/div/div/button[9]"));
 	TextDesignButton1.click();
 
 	
 	
 
 	// 글자 크기 탭 열기
 	WebElement TextSizeTab = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[2]/div/button"));
 	TextSizeTab.click();

 	
 	// 글자 크기 탭 선택
 	WebElement TextSizeSelect = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/header/div[2]/ul/li[2]/div/div/button[3]"));
 	TextSizeSelect.click();
 
 	
 	
    // 블로그 본문 버튼 클릭
 	
 	
 	
 	WebElement ContentPlaceHolder = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[2]/section/article/div[2]/div/div/div/div/p"));	
 	ContentPlaceHolder.click();
 	
 	
	actions.sendKeys(ContentPlaceHolder,"포스트 내용 입니다.").perform();
 	
 	


	
	// 발행 버튼 클릭
	WebElement WriteButton = driver.findElement(By.className("publish_btn__m9KHH"));

	 
	//클릭 시, 어떠한
	((JavascriptExecutor)driver).executeScript("arguments[0].click() ", WriteButton);

	 
	 // 발행하기
	 WebElement WriteButtonOK = driver.findElement(By.className("confirm_btn__WEaBq"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].click() ", WriteButtonOK);

 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 
	
	
	
	
	

 	
 	
 	
	
	

 	
 	
 	
 	
 	
 	

  	 
  	

  	 
  	 
  	 
  	
  
 	 
 	 
      
      
	  
	  
	  
	  
	  
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
