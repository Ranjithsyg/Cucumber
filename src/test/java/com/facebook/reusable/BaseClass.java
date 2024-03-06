package com.facebook.reusable;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		public static WebDriver driver;
		public static JavascriptExecutor js ;
		public static Actions action;
		public static Select s;
		
		public static BaseClass base = null;
		private BaseClass() {}
	
		public static BaseClass getInstance() {
			if(base==null) {
				base = new BaseClass();
		 	}
			return base;
		}	
		public static void browserLaunch() {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("start-maximized");
			driver = new EdgeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			js = (JavascriptExecutor)driver;
			action = new Actions(driver);

		}
		public static void browserClose() {
			driver.close();
		}
		
		public static  void gotourl(String url)
		{
			driver.get(url);
			
		}
		public static void browserquit() {
			driver.quit();
		}

        public void pageRefresh() {
        	driver.navigate().refresh();
        }
        public void pageForward() {
        	driver.navigate().forward();
        }
        public void pageBackward() {
        	driver.navigate().back();
         }
        public String giveCurrentUrl() {
    		String text = driver.getCurrentUrl();
    		return text;
    	}
    	
		public void sendtext(WebElement element, String value) {
			element.sendKeys(value);
		}	
		public static void button(WebElement element) {
			element.click();
		}
		public String returntaxt(WebElement element) {
			String title = element.getText();
			return title;
		}
		public String attribute(WebElement element,String attribute) {
			String string= element.getAttribute(attribute);
			return string;
		}
		public String attributevalue(WebElement element,String value) {
			String string1= element.getAttribute(value);
			return string1;	
		}

		public void gotoElement(WebElement element) {
			action.moveToElement(element).build().perform();
			
		}
		public void rightClick(WebElement element) {
			action.contextClick(element).build().perform();
			
		}
		public void twoClick(WebElement element) {
			action.doubleClick(element).build().perform();
			
		}
		public void moveOnoneElementToAnother(WebElement source,WebElement target) {
			action.dragAndDrop(source, target).build().perform();
			
		}
	    public void sendtext(String value,String act) {
				
			action.sendKeys(value).build().perform();;
			}
	    public void button(WebElement e,String ac) {
			
			action.click(e).build().perform();;
			}
	    
		public void sendtext(Alert a, String value) {
			action.sendKeys(value);
		}
       public void sendtext(String value, WebElement e) {
			
			action.sendKeys(e, value).build().perform();
		}
		public Alert alart() {
			Alert alert=driver.switchTo().alert();
			return alert;
		}
       public void agreeAlert(Alert alert)
       {
    	  alert.accept();
       }
       
       public void dismissAlert(Alert alert)
       {
    	  alert.dismiss();
       }
       
       public void sendtext(String value,Alert alert)
       {
    	  alert.sendKeys(value);
       }
       
		public String returntext(Alert alert) {
			String text=alert.getText();
			return text;
		}
		
		public void sendtext(WebElement element, String value,int i) {
			
			js.executeScript("arguments[0].setAttribute('value',"+value+")", element);
		}
		
		public Object returnAttribute(WebElement element) {
			Object object=js.executeScript("arguments[0].getAttibute(value)",element);
			return object;
		}
		
		public void button(String sd,WebElement element) {
			js.executeScript("argument[0].click()", element);
		}
		
		public void scrollDown(WebElement element) {
			
			js.executeScript("argument[0].scrollIntoView(false)", element);
		}
		
		public void scrollUp(WebElement element) {
			
			js.executeScript("argument[0].scrollIntoView(true)", element);
		}
		
		public void capturePic(String file) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File f = new File(".\\target\\"+file+".png");
			try {
				FileUtils.copyFile(source, f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
    	public boolean whetherDisplayed(WebElement webelement ) {
    		boolean displayed = webelement.isDisplayed();
    		return displayed;
    	}
    	
    	public boolean whetherSelected(WebElement webelement ) {
    		boolean selected = webelement.isSelected();
    		return selected;
    	}
    	
    	public boolean whetherEnabled(WebElement webelement) {
    		boolean enable = webelement.isEnabled();  
    		return enable;
    	}
    	
    	public void dadFrame(WebElement element) {
    		driver.switchTo().parentFrame();
    	}
    	
    	public void mainFrame(WebElement element) {
    		driver.switchTo().defaultContent();
    	}
    	
       	public void frameStringId(String value) {
    		driver.switchTo().frame(value);
    	}
       	
       	public void frameStringname(String value) {
    		driver.switchTo().frame(value);
    	}
       	
       	public void frameIndex(int value) {
    		driver.switchTo().frame(value);
    	}
       	
       	public void frameWebelement(WebElement element) {
    		driver.switchTo().frame(element);
    	}
       	
		public void handleWindowString(String url) {
			driver.switchTo().window(url);
		}
		
		public void handleWindowsTitle(String title) {
			driver.switchTo().window(title);
		}
		
		public void handleWindowsId(String Id) {
			driver.switchTo().window(Id);
		}
		
		public Set<String> handlechild(String chidWindow) {
			Set<String> child = driver.getWindowHandles();
			return child;
		}
		
		public String handleparent(String parentWindow) {
			String parent = driver.getWindowHandle();
			return parent;
		}
		
		public void selectIndexDropDown(WebElement element, int i) {
			s = new Select(element);
			s.selectByIndex(i);	
		}

		public void selectVisibleTextDropdown(String value, WebElement date) {	
			s = new Select(date);
			s.selectByVisibleText(value);
		}
		
       public void selectValueDropdown(WebElement element,String value) {
			s = new Select(element);
			s.selectByValue(value);
       }
       
       public List<WebElement> selectOption(WebElement element) {
			s = new Select(element);
			List<WebElement> options = s.getOptions();
			return options;
       }
       
       public List<WebElement> selectAllOption(WebElement element) {
			s = new Select(element);
			List<WebElement> options = s.getAllSelectedOptions();
			return options;
      }
       
       public WebElement selectFirstOption(WebElement element) {
 			s = new Select(element);
 			WebElement options = s.getFirstSelectedOption();
 			return options;
       }
       
      public boolean multiple(WebElement element) {
			s = new Select(element);
			boolean multiple = s.isMultiple();
			return multiple;
      }
      
      public void selectDeselectIndex(int v,WebElement element) {
  			s = new Select(element);
  			s.deselectByIndex(v);
        }
      
      public void selectDeselectvale(WebElement element, String value) {
   			s = new Select(element);
   			s.deselectByValue(value);
         }
      
      public void selectDeselectVisible(WebElement element, String value) {
 			s = new Select(element);
 			s.deselectByVisibleText(value);
       }
      
      public void selectDeselectAll(WebElement element, String value) {
  			s = new Select(element);
  			s.deselectAll();
        }


        
}
