package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumPractice extends RemoteWebDriver {

	private static WebDriver driver;//static variable
	int b = 10; // Instance variable
	Capabilities capabilities;
	public RemoteWebDriver rdriver = new RemoteWebDriver(capabilities);
	
	
	public void checkLocalVariable() {
		int b = 9;
		System.out.println(b);
		System.out.println(this.b);
	}
	
	public void FindElementCheck() {
		
		// searches the entire page using selector
		driver.findElement(By.id("name")).sendKeys("Hello"); 
		
		//First generates the webelement, then it search the child element of the give element
		WebElement parent = driver.findElement(By.id("name"));
		WebElement child = parent.findElement(By.id("child"));
		   child.sendKeys("Hello");
	
	}

	@FindBy(id="newuser")
	   WebElement username;
	public SeleniumPractice(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//Static initElements method of pagefactory class for initializing WebElement username
	}
	
	public void mouseHoverCheck() {

		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.id("elementID"));
		actions.moveToElement(element).build().perform();
	}

	public void frameCheck() {
		WebElement iframe = driver.findElement(By.id("iframe"));
		driver.switchTo().frame(iframe);
		//My actions to be performed
		driver.switchTo().defaultContent();

	}

	public void implicitWaitCheck() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*
	 * public ExplicitWaitCheck() { driver = new ChromeDriver(); WebDriverWait wait
	 * = new WebDriverWait(driver, 10); WebElement element =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")))
	 * ;
	 * 
	 * }
	 */

	public void checkArrayAndArrayList() {
		int [] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;

		System.out.print("Array elements: ");

		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

	public void HandleWindows() {

		System.setProperty("webdriver.chrome.exe","path of chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		//purpose of the navigate() is to navigate to the browser to different pages
		driver.navigate().to("https://www.example.com");
		driver.navigate().back();
		driver.navigate().forward();

		String originalWindowHandle = driver.getWindowHandle();
		//let say this click open a new window

		WebElement Originalclick = driver.findElement(By.id("click"));
		Originalclick.click();

		Set<String> windowHandles = driver.getWindowHandles();

		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(originalWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		//performing an action in new Window
		driver.findElement(By.id("newClick")).click();

		//once the operation is performed on the new window
		//switch back to the original window
		driver.switchTo().window(originalWindowHandle);

		driver.quit();
	}

	public void ExceptionCheck() {

		String filepath = "path of abc.txt";
		File file = new File(filepath);

		try {
			FileReader reader = new FileReader(file);

			int i;
			while((i=reader.read())!= -1) {
				System.out.println((char)i);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
					driver.manage().deleteAllCookies();
		}

	}
	
	public void takeScreenShotCheck(String ScreenshotName) {
		
		TakesScreenshot  takesscreenshot = (TakesScreenshot) driver;
		File screenShotFile = takesscreenshot.getScreenshotAs(OutputType.FILE);
		
		String destinationPath = "path to store screenshots"+ScreenshotName+".png";
		
		try {
			FileUtils.copyFile(screenShotFile,new File(destinationPath));
			System.out.println("Screenshot Captured "+destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void HandleWindowsandFrames() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		String OriginalWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.id("click")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String windowsHandle : windowHandles ) {
			if(!windowHandles.equals(OriginalWindowHandle)) {
				driver.switchTo().window(windowsHandle);
				break;
			}
		}
		driver.findElement(By.id("click on new window")).click();
		
		driver.switchTo().window(OriginalWindowHandle);
		
	}
	
	public void CheckedExceptionCheck() {
		try {
			FileInputStream fis = new FileInputStream("");
			
			BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
			String line = reader.readLine();
			
			if(line !=null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		}catch(FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//in the Testng.xml url is declared globally
	/*
	 * <suitename = "TestCycle" > 
	 * <parameter name="url" value="https://google.com">
	 * <test name="Regression"> 
	 * <Classes> 
	 * <class name="test.cycle">
	 */
	@Parameters({"url"})
	@Test
	public void LoginSteps() {
		
	}
	
	
	//Data parameterization for specific tests
	@DataProvider(name="provideSearch")
	public Object[][] getDataFormProvider(){
		return new Object[][] {
			{"test" , "test123"},
			{"qaclick", "test2023"},
		};
		
	}
	
	@Test(dataProvider="provideSearch" , groups= {"Sanity"}, enabled=false)
	public void enterUserDetails(String un , String pd) {
		System.out.printf(un , pd );
	}

	public static void main(String args[]) {
		SeleniumPractice sp = new SeleniumPractice(driver);

		//sp.checkArrayAndArrayList();
		sp.checkLocalVariable();
	}
}
