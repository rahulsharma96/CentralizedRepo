import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calender {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		while(!driver.findElement(By.cssSelector("[class='DayPicker-Month']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		List <WebElement> date = driver.findElements(By.cssSelector("[class='DayPicker-Day']"));
		int count = driver.findElements(By.cssSelector("[class='DayPicker-Day']")).size();
		for(int i=1; i<count;i++) {
			String item=driver.findElements(By.cssSelector("[class='DayPicker-Day']")).get(i).getText();
			if(item.contains("15"))
			{
				driver.findElements(By.cssSelector("[class='DayPicker-Day']")).get(i).click();
				System.out.println("date is selected");
				break;
			}
		}
	driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
	while(!driver.findElement(By.cssSelector("[class='DayPicker-Month']")).getText().contains("April"))
	{
		driver.findElement(By.cssSelector("[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	}
	List <WebElement> dates = driver.findElements(By.cssSelector("[class='DayPicker-Day']"));
	int count1 = driver.findElements(By.cssSelector("[class='DayPicker-Day']")).size();
	for(int i=1; i<count1;i++) {
		String item=driver.findElements(By.cssSelector("[class='DayPicker-Day']")).get(i).getText();
		if(item.contains("18"))
		{
			driver.findElements(By.cssSelector("[class='DayPicker-Day']")).get(i).click();
			System.out.println("date is selected");
			break;
		}
	}
	//driver.findElement(By.xpath("//input[@id='travellers']")).click();
	//driver.findElement(By.xpath("//li[@data-cy='adults-1']")).click();
driver.quit();

	
	}

}
