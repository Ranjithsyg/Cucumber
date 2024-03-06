package com.Ajio;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;


import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
    import com.facebook.reusable.BaseClass;

import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import locators.reusable.Locators;
	public class CreateAccount {
		
        public static BaseClass base= BaseClass.getInstance();
        public static Locators locate=Locators.getInstance();
		
		@Given("Launch the facebook website {string}")
		public void launch_the_facebook_website(String url) {
			BaseClass.gotourl(url);
			//base.capturePic(url);
		}
		
		@And("Click on Create new account")
		public void click_on_create_new_account() {
			WebElement create = BaseClass.driver.findElement(By.xpath("//a[contains(text(),'new')]"));
			create.click();
//			locate.getCreate().click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		@When("Enter First Name {string}")
		public void enter_first_name(String firstname) {
//			WebElement firstname = BaseClass.driver.findElement(By.xpath("//input[@name='firstname']"));
			base.sendtext(locate.getFirstname(), firstname);
		}
		@When("Enter Surname {string}")
		public void enter_surname(String string) {
//			WebElement lastname = BaseClass.driver.findElement(By.xpath("//input[@name='lastname']"));
			base.sendtext(locate.getLastname(),string);
			
		}
		@When("Enter the Mobile Number {string}")
		public void enter_the_mobile_number(String string) {
//			WebElement number = BaseClass.driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile')]"));
			base.sendtext(string.substring(2),locate.getNumber());
		}
		@When("Enter Password {string}")
		public void enter_password(String string) {
//			WebElement password = BaseClass.driver.findElement(By.xpath("//input[contains(@aria-label,'password')]"));
			base.sendtext(string, locate.getPassword());			
		}

		@When("Enter Date of Birth {string}")
		public void enter_date_of_birth(String dateOfBirth) {
//			WebElement dateDropdown = BaseClass.driver.findElement(By.xpath("//select[@id='day']"));
			Select select = new Select(locate.getDateDropdown());
			List<WebElement> options = select.getOptions();
			  for(WebElement option : options) {
				  String date = option.getText();
				  if(date.contains(dateOfBirth.substring(1))) {
					  select.selectByVisibleText(date);
				  }
			  }

		}

		@When("Enter Month of Birth {string}")
		public void enter_month_of_birth(String string) {
//			WebElement monthdropdown = BaseClass.driver.findElement(By.xpath("//select[@id='month']"));
            List<WebElement> selectOption = base.selectOption(locate.getMonthdropdown());
			  for(WebElement option : selectOption) {
				  String month = option.getText();
				  if(month.contains(string)) {
					  base.selectVisibleTextDropdown(string, locate.getMonthdropdown());
				  }
			  }
		}

		@When("Enter Year of Birth {string}")
		public void enter_year_of_birth(String string) {
//			  WebElement yearDropdown = BaseClass.driver.findElement(By.xpath("//select[@id='year']"));
			  Select select = new Select(locate.getYearDropdown());
			  List<WebElement> options = select.getOptions();
			  for(WebElement option : options) {
				  String year = option.getText();
				  if(year.contains(string.substring(1))) {
					  select.selectByVisibleText(year);
				  }
			  }

//			  WebElement gender = BaseClass.driver.findElement(By.xpath("//label[text()='Male']"));
			  locate.getGender().click();

				  }
	
		

		@Then("Click on Sign Up")
		public void click_on_sign_up() throws InterruptedException {
//				WebElement submit = BaseClass.driver.findElement(By.xpath("//button[@name='websubmit']"));
			
		try {
			//locate.getSubmit();
			base.button(locate.getSubmit());
			Thread.sleep(2000);
		
			List<WebElement> links =locate.getLink();
			Iterator <WebElement> iterator = links.iterator();
			while(iterator.hasNext()) {
				WebElement link = iterator.next();
				String href = base.attribute(link, "href");
				if(href == null || href.isEmpty()) {
					System.out.println("Link Not Available");
				}
				else if(!href.startsWith("https://www.facebook.com")) {
					System.out.println("Link not related to facebook: "+href);
				}
				else {
					HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
					http.setRequestMethod("HEAD");
					http.connect();
					int responsecode= http.getResponseCode();
					if(responsecode==200) {
						System.out.println("Link is not broken: "+href);
					}
				}
			}
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}}
				
		@And("TakeScreenshort {string}")
		public void take_screenshort(String string)  {
			try {
				Thread.sleep(5000);
				base.capturePic(string);
				Thread.sleep(5000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			BaseClass.driver.quit();
		} 		  
	}


