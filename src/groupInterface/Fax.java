package groupInterface;

public interface Fax {
	
	public void enviarFax (String texto, String numeroDestino);
	public String receberFax(String numeroOrigem);
}
