package execut;

import java.awt.image.BufferedImage;

import groupInterface.Copiadora;
import groupInterface.Fax;
import groupInterface.Printer;
import groupInterface.Scanner;

public class home {
	public static void main (String[] args) {
		
	Scanner scanner = Util.getScannerAtual();
	BufferedImage imagemDigitalizada = scanner.digitalizar();
	
	Fax fax = Util.getFaxAtual();
	fax.enviarFax("Hell World", "1996");
	String faxRecebido = fax.receberFax("1996");
	
	Copiadora cop = Util.getCopiadora();
	cop.copiarDocumento(10);
	
	Printer printer = Util.getPrinter();
	String dados = "Hello World";
	printer.imprimir(dados.getBytes(), 1);
		
	}
}
