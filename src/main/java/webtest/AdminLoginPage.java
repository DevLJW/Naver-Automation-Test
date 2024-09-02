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

// �α��� ������ ��ü
public class AdminLoginPage {
	
		WebDriver driver;
		
		WebElement email;
		WebElement password;
		WebElement submit;
		
		private Clipboard clipboard;
		
		public AdminLoginPage(WebDriver driver) {
			
			this.driver = driver;
			driver.get("http://nid.naver.com/nidlogin.login?mode=form&url=https://www.naver.com/");
			
			email = driver.findElement(By.id("id"));
			password = driver.findElement(By.id("pw"));
			submit = driver.findElement(By.id("log.login"));
		
		}
		
		
		public void login() throws InterruptedException, UnsupportedFlavorException, IOException {
			
			//https://badong.tistory.com/242
		
			//selenium �ڵ�ȭ�� �α��� ��, �ڵ��Է� ���� ���� ������ clipboard�� ����Ͽ� �����Ͽ� �����͸� �ִ´�.
			JavascriptExecutor js = (JavascriptExecutor)driver;		
	
			js.executeScript("arguments[0].value=arguments[1]", email, "�̸���");
			Thread.sleep(1000);
			js.executeScript("arguments[0].value=arguments[1]", password, "�н�����");
			Thread.sleep(1000);
	

		
			submit.click();
			
		}
		
		
		
		
}
