/**
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class Techpark {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://techparkit.com/index.php");
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/article[1]/div[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/span/span")).click();
		//driver.findElement(By.name("identifier")).sendKeys("armansarkar715@gmail.com");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[3]/a")).click();
		driver.close();
		
		
		
		
		
	}

}
