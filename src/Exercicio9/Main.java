package Exercicio9;

public class Main {

	public static void main(String[] args) {
		
		Votos votos = new Votos();
		votos.Eleitores = 1000;
		votos.VotosValidos = 400;
		votos.VotosBrancos = 300;
		votos.VotosNulos = 300;
		
		double votosValidos = votos.PorcenVotosValidos();
		
		double votosBrancos = votos.PorcenVotosBrancos();
		
		double  votosNulos = votos.PorcenVotosNulos(); 
		
		System.out.println("Percentual de votos válidos: " + votosValidos + "%");
		System.out.println("Percentual de votos Brancos: " + votosBrancos + "%");
		System.out.println("Percentual de votos Nulo: " + votosNulos + "%");
		System.out.println("Total de eleitores: " + votos.Eleitores);
		
		
	}

}
