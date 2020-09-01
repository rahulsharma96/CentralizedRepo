import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	public browser(int a) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RAHUL\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
		public static void main(String[] args) throws InterruptedException {
			browser br = new browser();
			browser br1 = new browser(20);
		}




}
