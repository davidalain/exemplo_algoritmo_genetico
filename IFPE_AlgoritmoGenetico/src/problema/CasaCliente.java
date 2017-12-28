package problema;

import java.util.Random;

public class CasaCliente extends PontoFim {
	
	public static final int QUANTIDADE_CASAS = 7;
	
	public CasaCliente(int idCasaCliente) {
		this.id = idCasaCliente;
	}
	
	/**
	 * Novo aleatório
	 */
	public CasaCliente() {
		this.id = (new Random()).nextInt(QUANTIDADE_CASAS);
	}

}
