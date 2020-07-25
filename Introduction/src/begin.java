import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class begin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.get("http://www.freejobalert.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//in this we'll study about the navigation buttons i.e. forward and backward button.
	}

}
