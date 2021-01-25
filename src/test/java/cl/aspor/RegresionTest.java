package cl.aspor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class RegresionTest {

	@Test
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verity.cl/");
		assertTrue(driver.getTitle().contains("Verity"));
		driver.quit();
		
	}

}
