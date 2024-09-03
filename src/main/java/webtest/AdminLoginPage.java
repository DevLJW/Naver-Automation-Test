package webtest;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// 로그인 페이지 객체
public class AdminLoginPage {
	
		WebDriver driver;
		
		WebElement email;
		WebElement password;
		WebElement submit;
		
		
		public AdminLoginPage(WebDriver driver) {
			
			this.driver = driver;
			driver.get("http://nid.naver.com/nidlogin.login?mode=form&url=https://www.naver.com/");
			
			email = driver.findElement(By.id("id"));
			password = driver.findElement(By.id("pw"));
			submit = driver.findElement(By.id("log.login"));
		
		}
		
		
		public void login() throws InterruptedException, UnsupportedFlavorException, IOException {
			
		
			
			JavascriptExecutor js = (JavascriptExecutor)driver;		
			// 빠른 타이핑이 아닌 붙혀넣는 효과 
			js.executeScript("arguments[0].value=arguments[1]", email, "이메일");
			Thread.sleep(2000);
			
			js.executeScript("arguments[0].value=arguments[1]", password, "패스워드");
			Thread.sleep(2000);
	
			submit.click();
		
			
		}
		
		
		
		
}
