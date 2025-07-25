package songs_spotify;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class favorite {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver","C:\\Users\\91798\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.get("https://open.spotify.com/");
	    driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException, IOException{
		driver.findElement(By.xpath("//*[@id=\"global-nav-bar\"]/div[3]/div/div[2]/button[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("khaju4973@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]/span[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"encore-web-main-content\"]/div[2]/div/div/div/form/div[2]/div[1]/div[1]/div/div[1]/input"));
		Thread.sleep(30000);
		Thread.sleep(2000);
		driver.get("https://open.spotify.com/collection/tracks");
		Thread.sleep(4000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\91798\\Desktop\\Sreenshot\\image.jpg"));
		
	}
}
