package cl.aspor;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	protected WebDriver getDriver() { 
		return this.driver;
	}
	
	protected WebDriverWait getWait() {
		return this.wait;
	}
	
	
	@BeforeEach
	//@BeforeMethod
	public void start(){
		//Crear Driver y Espera expl�cita
		driver = Configuration.createChromeDriver(); //instanciar el driver y el wait(explicito)
		wait = new WebDriverWait(driver, 60); //max 60 segundos
		
		driver.get(Configuration.URL);
		driver.manage().window().maximize();
	}
	
	@AfterEach
	//@AfterMethod
	public void finish() throws Exception{
		driver.quit(); 
	}
	
		
	/*
	 * takeScreenShotTest es una clase que permite guardar evidencias de im�genes en un repositorio local.
	 */
	public static void takeScreenShotTest(WebDriver driver, String imageName) {
		TakesScreenshot captura = (TakesScreenshot) driver; //castear de un WebDriver a TakesScreenshot
		File archivoCaptura = captura.getScreenshotAs(OutputType.FILE);
		String path = String.format("%s%s-%s-%s.png", Configuration.SCREENSHOT_DIR, "Captura",imageName,System.currentTimeMillis());
		archivoCaptura.renameTo(new File(path));
	}
}
