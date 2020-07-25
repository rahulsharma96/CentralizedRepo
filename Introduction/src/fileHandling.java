import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
				 
	 FileInputStream file = new FileInputStream("C:\\Users\\RAHUL\\Desktop\\data.txt");
	 System.out.println("Step1"); 
	 BufferedReader br = new BufferedReader(new InputStreamReader(file));
	 String Content;
	 
	 System.out.println("Step2");
	 while((Content=br.readLine()) != null)
	 {
	 System.out.println(Content);
	 }
	 br.close();
	 driver.quit();
	}
}
