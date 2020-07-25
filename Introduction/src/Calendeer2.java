import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendeer2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='fswTabs latoBlack greyText']/li[1]")).click();
			//driver.findElement(By.xpath("//input[@data-cy='fromCity']")).click();
		//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys("Mum");
			driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys(Keys.ARROW_DOWN );
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys(Keys.ENTER);
			System.out.println("Done");
	}

}
