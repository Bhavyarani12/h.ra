package h.ra.h.ra;





	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class search_flight {
		
	WebDriver driver;
		
		
		@BeforeTest
		public void startbrowser() throws IOException, InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
	        driver=new ChromeDriver();
	        
	        driver.get("https://www.phptravels.net/");
	        driver.manage().window().maximize();
	        
	      //Screenshot and title
	   	 
//	   	 TakesScreenshot ts=(TakesScreenshot)driver;
//	   	 File file=ts.getScreenshotAs(OutputType.FILE);
//	   	 FileUtils.copyFile(file, new File("D:\\Screenshot\\fb"));
//	   	 
	   	 
	   	String actualtitle=driver.getTitle();
		  Thread.sleep(1000);
		
	   	
		}
		
		@Test(priority=0)
		public void search_flight() throws InterruptedException
		{
			//flights
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
			Thread.sleep(2000);
			//radiobutton
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[9]/div[2]/div[1]/div[1]/ins[1]")).click();
			//enter location
			driver.findElement(By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[18]/div[1]/input[1]")).sendKeys("Dubai Intl Arpt");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
			Thread.sleep(2000);
			//enter location
			driver.findElement(By.xpath("//span[contains(text(),'Enter Location')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/input[1]")).sendKeys("Hubli Arpt");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
			Thread.sleep(2000);
		
		
			
			
			
			
			//date
			driver.findElement(By.xpath("//input[@id='departure']")).clear();
			driver.findElement(By.xpath("//input[@id='departure']")).sendKeys("2019/09/26");
			driver.findElement(By.xpath("/html[1]/body[1]/div[15]/div[1]/table[1]/tbody[1]/tr[5]/td[5]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[16]/div[1]/table[1]/tbody[1]/tr[5]/td[6]")).click();
			//search
			driver.findElement(By.xpath("//div[contains(@class,'bgfade col-md-3 col-xs-12 search-button')]//button[contains(@class,'btn-primary btn btn-lg btn-block pfb0')][contains(text(),'Search')]")).click();
			//guests
//			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[6]/button[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/form[1]/div[6]/button[1]")).click();
//			Thread.sleep(2000);
//		
		}
		
		}





	

