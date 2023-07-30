package PracticeFramework.PracticeFramework;

public class PracticePage {
	
	/*
	 * mvn archetype:generate -DgroupId=com.test -DartifactId=testingGoogle
	 * -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
	 * 
	 * 
	 * ArrayList<String> arr = new ArrayList<String>();
	 * 
	 * arr.add("W"); arr.add("I"); arr.add("N"); arr.add("G"); arr.add("S");
	 * 
	 * 
	 * for(int i=0; i <= al.size(); i++){ System.out.println(arr.get(i));
	 * 
	 * }
	 * 
	 * for(String i : arr){ System.out.println(i); }
	 * 
	 * Iterator it = arr.iterator();
	 * 
	 * while(it.hasNext()){ System.out.println(it.next());
	 * 
	 * }
	 * 
	 * WebDriver driver;
	 * System.setProperty("webriver.chrome.driver","path of chromedriver.exe");
	 * driver = new ChromeDriver();
	 * 
	 * --headless ChromeOptions options = new ChromeOptions();
	 * options.addArgument("--headless"); WebDriver driver = ChromeDriver(options);
	 * 
	 * 
	 * 
	 * Explicit wait- to handle Synchronization issues WebDriverWait wait = new
	 * WebDriverWait(driver,3); WebElement element =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
	 * 
	 * --perform mousehover action
	 * 
	 * Actions actions = new Actions(driver); WebElement element =
	 * driver.findElement(By.id("elementId"));
	 * actions.moveToElement(element).build().perform();
	 * 
	 * 
	 * 
	 * Actions actions = new Actions(driver); WebElement element =
	 * driver.findElements(By.id("elementId"));
	 * actions.moveToElement(element).build().perform();
	 * 
	 * //to handle Window
	 * 
	 * String originalWindowHandle = driver.getWindowHandle();
	 * 
	 * driver.findElement(By.id("")).click();
	 * 
	 * Set<String> windowHandles = driver.getWindowHandles();
	 * 
	 * for(String windowHandle : windowHandles){
	 * 
	 * if(!windowHandle.equals(originalWindowHandle)){
	 * driver.switchTo().window(windowHandle); break; } }
	 * 
	 * driver.findElement(By.id("newWindowClick")).click();
	 * 
	 * //getback to the original win driver.switchTo().window(originalWindowHandle);
	 * 
	 * driver.quit();
	 * 
	 * 
	 * //TakeScreenshot
	 * 
	 * public void captureScreenshotCheck(String ScreenshotName){
	 * 
	 * TakesScreenshot takesscreenshot = (TakesScreenshot) driver; File
	 * screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	 * 
	 * String Destinationpath = "path of the destination"+ScreenshotName+".png";
	 * 
	 * try{ FileUtils.copyFile(screenshotFile,new File(Destinationpath));
	 * System.out.println("Screenshot captured  :" +Destinationpath); }
	 * catch(IOException e){ e.printStackTrace(); } }
	 * 
	 * 
	 * //@DataProvider
	 * 
	 * 
	 * @DataProvider(name="provideSearch") public Object[][] getDataFormProvider(){
	 * 
	 * return new Object[][]{
	 * 
	 * {"test","pass123"}, {"test123","pass234"},
	 * 
	 * };
	 * 
	 * }
	 * 
	 * @Test(dataProvider="provideSearch") public void userDetails(String un , Sting
	 * pd){ }
	 * 
	 * 
	 * <suite name <test name
	 * 
	 * <groups> <run> <include name="Sanity"> </run> </groups>
	 * 
	 * <Classes> <class name=""/>
	 * 
	 * @Test(groups={"Sanity"},enabled=false)
	 * 
	 */


}
