import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class revise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("freshers world");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='sld vsc']/span/h3[1]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
	}

}
