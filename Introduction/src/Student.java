import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student {
	public void method1() throws InterruptedException 
	{
		this.method2(); //It will call method 2
		System.setProperty("webdriver.chrome.driver","C:/Users/RAHUL/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		System.out.println("I am method1");
		System.out.println(driver.getTitle());
	}
	public void method2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/RAHUL/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		System.out.println("I am method2");
		System.out.println(driver.getTitle());
	}
	
		public static void main(String[] args) throws InterruptedException
		{
			Student S1 = new Student();
			S1.method1();
		}
}
