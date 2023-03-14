package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import uitilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="bvtdata")
	public static void LoginTest(String Uname, String pwd) throws InterruptedException {
		System.out.println("Clicked Successfully");
		Thread.sleep(3000);
		driver.findElement(By.linkText(loc.getProperty("signinlink"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("Email_Field"))).sendKeys(Uname);
		driver.findElement(By.xpath(loc.getProperty("Next_Buton"))).click();
		Thread.sleep(3000);

		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(pwd);
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
		driver.close();
	}
//@DataProvider(name="TestData")
//public Object[][] tData() {
//	return new Object[][] {
//			{"kulvir_04@yahoo.co.in","Payatm@123"},
//			{"kulvir_04@yahoo.co.inn","Tayatm@123"},
//			{"pulvir_04@yahoo.co.in","Rayatm@123"},
//			{"sulvir_04@yahoo.co.in","Payatm@123"}
//	};

}
