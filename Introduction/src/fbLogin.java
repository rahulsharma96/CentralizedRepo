import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("rahulstgirischool@gmail.com");
		System.out.println("Id");
		driver.findElement(By.id("pass")).sendKeys("9818014238");
		System.out.println("Pass");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
	
	}

}
