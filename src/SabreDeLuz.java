
public class SabreDeLuz {

	private String cor;
	private String tipoDoSabre;
		
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoDoSabre() {
		return tipoDoSabre;
	}

	public void setTipoDoSabre(String tipoDoSabre) {
		this.tipoDoSabre = tipoDoSabre;
	}

	public SabreDeLuz(String cor, String tipoDoSabre) {
		this.cor = cor;
		this.tipoDoSabre = tipoDoSabre;
	}
	
}
