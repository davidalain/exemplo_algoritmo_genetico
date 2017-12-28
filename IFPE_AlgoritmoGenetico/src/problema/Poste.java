package problema;

import java.util.Random;

public class Poste extends PontoFim{

	public static final int QUANTIDADE_POSTES = 5;
	
	public Poste(int idPoste) {
		this.id = idPoste;
	}
	
	/**
	 * Novo aleatório
	 */
	public Poste() {
		this.id = (new Random()).nextInt(QUANTIDADE_POSTES);
	}
	
	
}
