import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {

	public static void main(String[] args) {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://techparkit.com/index.php");
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("Arman");
		driver.findElement(By.name("lastName")).sendKeys("Sarkar");
		driver.findElement(By.name("email")).sendKeys("armansarkar715@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/form/textarea")).sendKeys("please see my email");
		//driver.findElement(By.xpath("/html/body/section/div/form/button")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		driver.findElement(By.xpath("/html/body/footer/div[1]/div[4]/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\":ru:\"]")).sendKeys("01721337945");
		driver.findElement(By.xpath("//*[@id=\":r11:\"]")).sendKeys("arman25");
		driver.findElement(By.xpath("//*[@id=\"login_popup_cta_form\"]/div/div[5]/div/div/div[1]/div/span/span")).click();
		
		

	}

}
