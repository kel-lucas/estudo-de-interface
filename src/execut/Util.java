package execut;

import java.util.Date;

import equipaments.Impressora;
import groupInterface.Fax;
import groupInterface.Multifuncional;
import groupInterface.Printer;
import groupInterface.Scanner;

public class Util {
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
	
	public static Scanner getScannerAtual() {
		return getImpressoraInstance();
	}
	
	public static Fax getFaxAtual() {
		return getImpressoraInstance();
	}
	
	public static Fax getCopiadora() {
		return getImpressoraInstance();
	}
	
	public static Printer getPrinter() {
		return getImpressoraInstance();
	}
	
	public static Multifuncional getImpressora() {
		return getImpressoraInstance();
	}
}
