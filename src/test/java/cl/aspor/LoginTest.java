package cl.aspor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginTest extends BaseClass{
	
	/*
	 * Scenario: Validar LOGIN DE SESI�N
	 *  - Despliegue
	 *  - Realizar Login de Inicio de Sesi�n 
			- Sin datos (todos los campos vac�os).
	 *  - Realizar Login de Inicio de Sesi�n 
			- campo Usuario vac�o.
	 *  - Realizar Login de Inicio de Sesi�n 
			- campo Contrase�a vac�o.
	 *  - Realizar Login de Inicio de Sesi�n con Datos incorrectos.
			- campo Contrase�a no v�lido.
	 *  Realizar Login de Inicio de Sesi�n
			- EXITOSO
	 */
	
	@Test
	void login_Exitoso() throws Exception {
		/*
		 * Implementaci�n: PoC_FUN_006
		 */
		this.getWait().until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-32"))).click();
		
		WebElement usuario = getWait().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='text']")));
		usuario.sendKeys(Configuration.USER);
		
		WebElement contraseña = getWait().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='password']")));
		contraseña.sendKeys(Configuration.PASS);
		
		this.getWait().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[type='submit']"))).click();
		Thread.sleep(8000);
		
		//Validaci�n Acceso a p�gina PORVENIR
		String tituloPaginaLogin = this.getDriver().getTitle();
		assertEquals("Porvenir", tituloPaginaLogin, "Valida tulo de p�gina");

		System.out.println("Prueba PoC_FUN_006 Exitosa");	
	}

}
