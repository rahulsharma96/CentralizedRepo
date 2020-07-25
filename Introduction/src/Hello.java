import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		WebElement cdriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(cdriver.findElements(By.tagName("a")).size());

	for (int i = 1; i < cdriver.findElements(By.tagName("a")).size(); i++) {
			cdriver.findElements(By.tagName("a")).get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println("Initialize1");
			Thread.sleep(5000);
	
	}
	}
}