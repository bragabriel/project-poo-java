import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Objetos (sabreDeLuz) 
		SabreDeLuz sabreYoda = new SabreDeLuz("Verde", "Curto");
		SabreDeLuz sabreAnakin = new SabreDeLuz("Azul", "Comum");
		SabreDeLuz sabreLuke = new SabreDeLuz("Azul", "Comum");
		
		//Objeto (Yoda)
		Yoda yoda = new Yoda("Yoda", "N'Kata Del Gormo", "Yoda", sabreYoda, "Absorver Relâmpago");
				
		//Sobrecarga de método 
		yoda.nivelJedi("Grão-Mestre Jedi");
		
		//Método abstract
		yoda.manipulacaoDaForca();
		
		//Método + interface/protocolo
		yoda.imprimirHabilidadeEspecial();
		
		
		
		//Objeto (Anakin criança)
		Anakin anakinKID = new Anakin("Anakin Skywalker (criança)", "Obi-Wan Kenobi", "Humano", sabreAnakin);
		
		//Sobrecarga de método
		anakinKID.nivelJedi();
		
		
		
		//Objeto (Luke Skywalker)
		Luke luke = new Luke("Luke Skywalker", "Obi-Wan & Yoda", "Humano", sabreLuke, "Comunicação com os mortos");
		
		//Sobrecarga de método
		luke.nivelJedi("Cavalheiro Jedi");
		
		//Método abstract
		luke.manipulacaoDaForca();
		
		//Método + interface/protocolo
		luke.imprimirHabilidadeEspecial();
		
		
		
		//Polimorfismo
		ArrayList<Jedi> listaJedis = new ArrayList<Jedi>();
		
		listaJedis.add(yoda);
		listaJedis.add(anakinKID);
		listaJedis.add(luke);
		
		System.out.println("\nvvvvvvvvvvvvvvvvvv");
		System.out.println("\nImprimindo a lista de Jedi(s):\n");
		for(int i = 0; i < listaJedis.size(); i++) {
			System.out.println((i+1) + "° Jedi da lista: ");
			listaJedis.get(i).imprimirCaracteristicasJedi();;
		}
		System.out.println("^^^^^^^^^^^^^^^^^^");
		
		
		
		
		//Objeto (Clone Trooper)
		CloneTrooper clone1 = new CloneTrooper();
		
		//Método + Membro Constante
		clone1.exibirCaracteristicaCloneTrooper();
		
		clone1.gerarClone();
	
		clone1.getquantidadeCloneTrooper();
		
		clone1.gerarClone();
		
		clone1.getquantidadeCloneTrooper();
	}
	
}