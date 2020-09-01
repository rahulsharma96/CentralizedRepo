import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//source
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys(("Mum"),Keys.ARROW_DOWN,Keys.ENTER);
		//driver.findElement(By.)
		
		//destination
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys(("Del"),Keys.ARROW_DOWN,Keys.ENTER);
		
		//date
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
