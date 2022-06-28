package execut;

import java.util.Date;

import equipaments.Impressora;
import groupInterface.Copiadora;
import groupInterface.Fax;
import groupInterface.Multifuncional;
import groupInterface.Printer;
import groupInterface.Scanner;

public class Util {
	
	
	//1
	private static Impressora impressora;
	
	private static Impressora getImpressoraInstance() {
		if (impressora == null) {
			impressora = new Impressora();
			impressora.setCor("Cor da Impressora");
			impressora.setDataCompra(new Date());
			impressora.setMarca("Marca da Impressora");
			impressora.setModelo("Modelo da Impressora");
			impressora.setNumeroSerie("123789asdrtyu");
		}
		return impressora;
	}
	
	//2
	public static Scanner getScannerAtual() {
		return getImpressoraInstance();
	}
	
	//3
	public static Fax getFaxAtual() {
		return getImpressoraInstance();
	}
	//4
	public static Copiadora getCopiadora() {
		return getImpressoraInstance();
	}
	
	//5
	public static Printer getPrinter() {
		return getImpressoraInstance();
	}
	//6
	public static Multifuncional getImpressora() {
		return getImpressoraInstance();
	}
}
