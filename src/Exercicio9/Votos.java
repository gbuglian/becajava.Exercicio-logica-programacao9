package Exercicio9;

public class Votos {
	public double VotosValidos;
	public double VotosBrancos;
	public double VotosNulos;
	public int Eleitores;
	
	public double PorcenVotosValidos() {
		return (VotosValidos / Eleitores) * 100;
	}
	
	public double PorcenVotosBrancos() {
		return (VotosBrancos / Eleitores) * 100;
	}
	
	public double PorcenVotosNulos() {
		return (VotosNulos / Eleitores) * 100;
	}
}	