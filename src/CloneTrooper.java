
public class CloneTrooper {

	private final String caracteristicaPadrao = "\"Todos os Clone Troopers são um clone do caçador de recompensas Jango Fett\"";
	
	private static int quantidadeCloneTrooper = 0; // Membro Estático
	
	public void exibirCaracteristicaCloneTrooper() {
		System.out.println("\nA caracteristica padrão dos Clone Troopers é: \n" + this.caracteristicaPadrao);
	}

	public void imprimirCaracteristicaClone() {
		System.out.println(this.caracteristicaPadrao);
	}
	
	public void gerarClone() {
		quantidadeCloneTrooper++; // Membro Estático
	}
	
	public int getquantidadeCloneTrooper() {
		System.out.println("\nA quantidade de Cloone(s) Trooper(s) existente é de: " + quantidadeCloneTrooper);
		return quantidadeCloneTrooper; // Membro Estático
	}
	
}
