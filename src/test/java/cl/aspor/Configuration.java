package cl.aspor;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Configuration {
	public static String ROOT_DIR = System.getProperty("user.dir")+ File.separator;
	public static String SCREENSHOT_DIR = ROOT_DIR + "screenshots" +File.separator;
	public static String FILES_DIR = ROOT_DIR + "files" +File.separator;
	public static String DRIVERS_DIR = ROOT_DIR + "drivers" +File.separator;
	public static String CHROME_DRIVER = DRIVERS_DIR + "chromedriver";
	public static String GECKO_DRIVER = DRIVERS_DIR + "geckodriver";
	public static String EDGE_DRIVER = DRIVERS_DIR + "msedgedriver";
	
	public static String URL = "https://demo.aspor.cl/";
	
	public static String USER = "test_prod";
	public static String PASS = "test_prod";
	public static String PASS_NO_VALIDA = "12345";
	public static String RUT_ASEGURADO = "99999-7";
	public static String RUT_INCORRECTO = "12345-6";
	public static String PATENTE = "BHTF68";
	public static String FECHA_INICIO_VIGENCIA = "14-01-2021";
	public static String FECHA_TERMINO_VIGENCIA = "30-04-2021";
	public static String FECHA_PRIMER_VENCIMIENTO = "25-01-2021";
	public static String FECHA_PRIMER_VENCIMIENTO_INCORRECTA = "21-01-2021";
	public static String FECHA_PRIMER_VENCIMIENTO_ANTERIOR = "05-01-2021";
	public static String MONTO = "100";
	public static String MONTO_NEGATIVO = "-100";
	public static String PRIMA_NETA = "3";
	public static String PRIMA_NETA_NEGATIVO = "-3";
	public static String NUMERO_CUOTAS = "3";
	public static String NUMERO_CUOTAS_NEGATIVO = "-3";
	public static String NUMERO_CUOTAS_ALTO = "10";
	public static String USO_VEHICULO = "Particular";
	public static String MONEDA_UF = "01 - UF";
	public static String SUCURSAL = "1 - Casa Matriz";
	public static String PRIMERA_COBERTURA = "Seguro de Accidentes Personales";
	public static String SEGUNDA_COBERTURA = "Seguro Rentas M�dicas POL320130667";
	public static String RAMO_VEHICULOS_LIVIANOS = "72 - Vehiculos Livianos";
	public static String RAMO_ACCIDENTES_PERSONALES = "11 - Accidentes Personales";
	public static String TEXTO_INICIO_VALIDACION = "Inicio: Tue Jan";
	public static String TEXTO_FINAL_VALIDACION = "Final: Tue Jan";
	public static String LISTA_MONEDA = "01 - UF\n" + 
			"03 - US$\n" + 
			"04 - EUR\n" + 
			"05 - UD\n" + 
			"06 - UDA";
	public static String LISTA_SUCURSALES = "1 - Casa Matriz\n" + 
			"2 - Copiap�\n" + 
			"3 - Iquique";
	public static String LISTA_RAMO = "11 - Accidentes Personales\n" + 
			"12 - Asiento de Pasajeros\n" + 
			"13 - Protecci�n Financiera\n" + 
			"14 - Soap\n" + 
			"21 - Fidelidad Funcionaria\n" + 
			"22 - Garant�a de Almacen Particular\n" + 
			"23 - Garantia\n" + 
			"24 - Garant�a Venta en Verde\n" + 
			"31 - Todo Riesgo Construcci�n\n" + 
			"32 - Todo Riesgo Montaje\n" + 
			"33 - Equipo M�vil\n" + 
			"34 - Instalaciones Electr�nicas\n" + 
			"41 - Multirriesgo Hogar\n" + 
			"42 - Multirriesgo Oficina Comercio Pyme\n" + 
			"43 - Multirriesgo Hogar Hipotecario\n" + 
			"44 - Remesa Valores\n" + 
			"45 - Incendio\n" + 
			"46 - Robo con Fractura\n" + 
			"51 - Responsabilidad Civil\n" + 
			"52 - Responsabilidad Civil Internacional\n" + 
			"53 - Responsabilidad Civil Profesional\n" + 
			"61 - Transporte Terrestre\n" + 
			"62 - Transporte Mar�timo\n" + 
			"63 - Transporte Aereo\n" + 
			"64 - Transporte Flotante\n" + 
			"65 - Casco\n" + 
			"71 - Vehiculos Pesados\n" + 
			"72 - Vehiculos Livianos\n" + 
			"73 - Motos\n" + 
			"81 - Miscel�neos";
	public static String INFO_GLOSA_VALIDACION_EXITOSO = "Proceso Existoso, puede APROBAR la p�liza";
	public static String INFO_VALIDACION_EXITOSA = "Inicio validaci�n\n" + 
			"Pas� validaci�n Rut del Asegurado ACTIVO\n" + 
			"Pas� validaci�n Rut del Contratante ACTIVO\n" + 
			"Pas� validaci�n del Estado del Intermediario\n" + 
			"Pas� validaci�n de Existencia Coberturas Repetidas\n" + 
			"Pas� validaci�n de prima de Coberturas\n" + 
			"Pas� validaci�n de cuotas vs Prima Neta\n" + 
			"Pas� validaci�n de Existencia de Reaseguro por cobertura\n" + 
			"Pas� validaci�n Vigencias de p�liza\n" + 
			"Pas� Validaci�n de Vigencias de Item\n" + 
			"Pas� validacion de Monto Asegurado por tipo de item.";
	public static String INFO_VALIDACION_NO_EXITOSA_1 = "Inicio validaci�n\n" + 
			"Pas� validaci�n Rut del Asegurado ACTIVO\n" + 
			"Pas� validaci�n Rut del Contratante ACTIVO\n" + 
			"Pas� validaci�n del Estado del Intermediario\n" + 
			"Pas� validaci�n de Existencia Coberturas Repetidas\n" + 
			"Existen coberturas en 0 o negativas, Revisar\n" + 
			"No se evalua las cuotas vs Prima Neta, por falla anterior\n" + 
			"No se evalua Existencia de Reaseguro por falla anterior\n" + 
			"No se evalua de Vigencias de la p�liza\n" + 
			"No se evalua las vigencias, por falla anterior\n" + 
			"No se eval�a l�mites por tipo de riesgo";
	public static String INFO_VALIDACION_NO_EXITOSA_DOS_COBERTURAS_IGUALES = "Inicio validaci�n\n" + 
			"Pas� validaci�n Rut del Asegurado ACTIVO\n" + 
			"Pas� validaci�n Rut del Contratante ACTIVO\n" + 
			"Pas� validaci�n del Estado del Intermediario\n" + 
			"Revisar coberturas repetidas en item 1\n" + 
			"No se evalua la Prima Neta, por falla anterior\n" + 
			"No se evalua las cuotas vs Prima Neta, por falla anterior\n" + 
			"No se evalua Existencia de Reaseguro por falla anterior\n" + 
			"No se evalua de Vigencias de la p�liza\n" + 
			"No se evalua las vigencias, por falla anterior\n" + 
			"No se eval�a l�mites por tipo de riesgo";
	
	public static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", modifyInWindows(CHROME_DRIVER));
		return new ChromeDriver();
	}
	
	public static WebDriver createFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", modifyInWindows(GECKO_DRIVER));
		return new FirefoxDriver();
	}
	
	public static WebDriver createEdgeDriver() {
		System.setProperty("webdriver.edge.driver", modifyInWindows(EDGE_DRIVER));
		return new EdgeDriver();
	}
	
	public static WebDriver createFireFoxDriverHeadless() {
		System.setProperty("webdriver.gecko.driver", modifyInWindows(GECKO_DRIVER));
		FirefoxOptions options  = new FirefoxOptions();
		options.setHeadless(true);
		return new FirefoxDriver(options);
	}
	
	//Portabilidad para ejecutar de forma automatica en cualquier OS (encapsulado)
	public static String modifyInWindows(String inPath) { 
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {
			return inPath + ".exe";
		}else {
			return inPath;
		}
	}
}
