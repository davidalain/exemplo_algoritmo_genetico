package problema;

public class Conexao {

	private CasaCliente casa;
	private Poste poste;
	private MapaConexoes mapa;

	public Conexao(CasaCliente casa, Poste poste) {
		super();
		this.casa = casa;
		this.poste = poste;
		this.mapa = MapaConexoes.instance();
	}

	/**
	 * Novo aleatório
	 */
	public Conexao(){
		this.casa = new CasaCliente();
		this.poste = new Poste();
	}

	public CasaCliente getCasa() {
		return casa;
	}
	public void setCasa(CasaCliente casa) {
		this.casa = casa;
	}
	public Poste getPoste() {
		return poste;
	}
	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public double distancia(){
		return mapa.distancia(casa, poste);
	}



}
