package com.appdragon.mobilemed.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appdragon.mobilemed.datapro.LoginDataProvider;
import com.appdragon.mobilemed.model.Login;
import com.appdragon.mobilemed.utils.DriverManager;
import com.appdragon.mobilemed.utils.Text;
import com.appdragon.mobilemed.utils.Xpaths;

public class Landing {
	
	private WebDriver driver= null;
	
	@Test(priority=1)
	public void checkTitle(){
		driver=DriverManager.driver;
		driver.get(Text.BASE_URL); 
		Assert.assertEquals(driver.getTitle(), Text.LOGIN_PAGE_TITLE);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=LoginDataProvider.class,priority=2)
	public void checkLogin(List<Login> logins) throws InterruptedException{
		for(Login login: logins){
			navigate("https://mobilemed-prep.mhealthcaresolutions.co.uk");
			driver.findElement(By.cssSelector(Xpaths.Login.INPUT_USER_NAME)).sendKeys(login.getUserName());
			driver.findElement(By.cssSelector(Xpaths.Login.INPUT_PASSWORD)).sendKeys(login.getPassword());
			driver.findElement(By.cssSelector(Xpaths.Login.BTN_SIGNIN)).submit();			
		}	
	}
	private void navigate(String url){
		driver.navigate().to(url);
		driver.navigate().refresh();
	}
	
	

}
