package com.appdragon.mobilemed.datapro;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.appdragon.mobilemed.utils.ExcelUtil;

public class LoginDataProvider {
	
	@DataProvider(name="loginData")
	public static Object[][] getLoginData() {
	        try {
				return new Object[][]{
						{
							ExcelUtil.getLoginData()
						},
					};
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}	        
	    }


}
