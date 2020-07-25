import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("identifierId")).sendKeys("rahuldeveloper11@gmail.com");
		driver.findElement(By.xpath("//span[@class='CwaK9']/span")).click();
		driver.findElement(By.xpath("//div[@class='Xb9hP']/input")).sendKeys("Rahul123*");
		driver.findElement(By.xpath("//span[@class='CwaK9']/span")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.linkText("Sign in")).click();
//		Set<String> ids =driver.getWindowHandles();
//		Iterator <String> it = ids.iterator();
//		String parentid =it.next();
//		String second = it.next();
//		driver.switchTo().window(second);
//		System.out.println(driver.getTitle());
//		
	}

}
