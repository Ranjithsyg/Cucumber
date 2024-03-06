package locators.reusable;
	import java.util.List;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.reusable.BaseClass;
	public class Locators  {
		
		public static Locators locate = null;
		
		private Locators() {
			PageFactory.initElements(BaseClass.driver, this);
		}

		public static Locators getInstance() {
			if(locate == null) {
				locate = new Locators();
		 	}
			return locate;
		}

		@FindBy(xpath = "//a[contains(text(),'new')]")
		private WebElement create;
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstname;
		
		@FindBy(xpath = "//input[@name='lastname']")
		private WebElement lastname;
		
		@FindBy(xpath = "//input[contains(@aria-label,'Mobile')]")
		private WebElement number;
		
		@FindBy(xpath = "//input[contains(@aria-label,'password')]")
		private WebElement password;
		
		@FindBy(xpath = "//select[@id='day']")
		private WebElement dateDropdown;
		
		@FindBy(xpath = "//select[@id='month']")
		private WebElement monthdropdown;
		
		@FindBy(xpath = "//select[@id='year']")
		private WebElement yearDropdown;
		
		@FindBy(xpath = "//label[text()='Male']")
		private WebElement gender;
	

		@FindBy(xpath = "//button[@name='websubmit']")
		private WebElement submit;
		
		@FindBy(tagName = "link")
		private List<WebElement> links;
		
		public WebElement getCreate() {
			return create;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getNumber() {
			return number;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getDateDropdown() {
			return dateDropdown;
		}

		public WebElement getMonthdropdown() {
			return monthdropdown;
		}

		public WebElement getYearDropdown() {
			return yearDropdown;
		}

		public WebElement getGender() {
			return gender;
		}

		public WebElement getSubmit() {
			return submit;
		}
		public List<WebElement> getLink() {
			return links;
		}


	}





