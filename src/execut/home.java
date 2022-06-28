package execut;

import java.awt.image.BufferedImage;

import equipaments.Impressora;
import groupInterface.Copiadora;
import groupInterface.Fax;
import groupInterface.Multifuncional;
import groupInterface.Printer;
import groupInterface.Scanner;

public class home {
	public static void main (String[] args) {
	
	//1
	Scanner scanner = Util.getScannerAtual();
	BufferedImage imagemDigitalizada = scanner.digitalizar();

	//2
	Fax fax = Util.getFaxAtual();
	fax.enviarFax("Hell World", "1996");
	String faxRecebido = fax.receberFax("1996");
	
	//3
	Copiadora cop = Util.getCopiadora();
	cop.copiarDocumento(10);
	
	//4
	Printer printer = Util.getPrinter();
	String dados = "Hello World";
	printer.imprimir(dados.getBytes(), 1);
		
	}
}
