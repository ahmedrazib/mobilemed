package com.appdragon.mobilemed.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DriverManager {

	static {
		System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\gecko\\wires.exe");
	}

	ProfilesIni prof = new ProfilesIni();
	FirefoxProfile ffProfile = prof.getProfile("Razib");
	
	public FirefoxProfile getFfProfile() {
		 ffProfile.setAcceptUntrustedCertificates(true);
		 ffProfile.setAssumeUntrustedCertificateIssuer(false);
		return ffProfile;
	}

	public static WebDriver driver = new FirefoxDriver();
	

	private DriverManager() {

	}

}
