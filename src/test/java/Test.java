import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2);
		//driver.close();
		WebElement fb = driver.findElement(By.xpath("//div[@class=\"x106a9eq\"]"));
		if(fb.isDisplayed())
				System.out.println("Test Pass");
		else
			System.out.println("Test fail");
	}
}
