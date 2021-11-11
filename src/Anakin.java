
public class Anakin extends Jedi{
	
	public Anakin(String nome, String mestre, String raca, SabreDeLuz sabreDeLuz) {
		super(nome, mestre, raca, sabreDeLuz);
	}
		
	//Método abstract 
	public void manipulacaoDaForca() {
		super.imprimirNomeJedi();
		System.out.println("está Manipulando a Força!");
	}
	
}
