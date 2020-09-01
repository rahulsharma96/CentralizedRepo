import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookAccountCreation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.get("https://www.facebook.com/");  //hit the url
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("love");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sharma");
		driver.findElement(By.xpath("//div[@class='mbm _a4y']/div/div/input[@name='reg_email__']")).sendKeys("kushrahul@yahoo.in");
		driver.findElement(By.xpath("//div[@class='mbm _a4y']/div/div/input[@name='reg_email_confirmation__']")).sendKeys("kushrahul@yahoo.in");
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']/div/div/input[@type='password']")).sendKeys("Bunty@123");
		driver.findElement(By.xpath("//select[@aria-label='Day']/option[@value='23']")).click();
		driver.findElement(By.xpath("//select[@aria-label='Month']/option[@value='7']")).click();
		driver.findElement(By.xpath("//select[@aria-label='Year']/option[@value='1996']")).click();
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@value='2']")).click();
		driver.findElement(By.xpath("//div[@class='_1lch']/button[@type='submit']")).click();	
	
	}		
	
}