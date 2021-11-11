
public class Luke extends Jedi implements IHabEspecial {
	
	private String habilidadeEspecial;
	
	public Luke(String nome, String mestre, String raca, SabreDeLuz sabreDeLuz, String habilidadeEspecial) {
		super(nome, mestre, raca, sabreDeLuz);
		this.habilidadeEspecial = habilidadeEspecial;
	}
	
	//Método abstract 
	public void manipulacaoDaForca() {
		System.out.println("Luke Skywalker está Manipulando a Força!");
	}
	
	//Método imprimir habilidadeEspecial
	public void imprimirHabilidadeEspecial() {
		System.out.print("Sua habilidade especial é: " + this.habilidadeEspecial + "\n");
	}

}
