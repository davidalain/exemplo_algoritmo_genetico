package problema;

import java.security.InvalidParameterException;

public class MapaConexoes {

	private static final double[][] mapa = {
		{},
		{},
		{},
	};
	
	private static MapaConexoes instancia = null;
	
	private MapaConexoes() {

		if(mapa.length != CasaCliente.QUANTIDADE_CASAS)
			throw new InvalidParameterException("mapa.length != CasaCliente.idsCasas.length");

		for(int i = 0 ; i < mapa.length ; i++){
			if(mapa[i].length != Poste.QUANTIDADE_POSTES)
				throw new InvalidParameterException("mapa["+i+"].length != Poste.QUANTIDADE_POSTES");
		}

	}
	
	public static MapaConexoes instance(){
		if(instancia == null){
			instancia = new MapaConexoes();
		}
		
		return instancia;
	}
	
	public double distancia(CasaCliente casa, Poste poste){
		
		if(casa.id >= CasaCliente.QUANTIDADE_CASAS)
			throw new InvalidParameterException("casa.id >= CasaCliente.QUANTIDADE_CASAS");
		if(poste.id >= Poste.QUANTIDADE_POSTES)
			throw new InvalidParameterException("poste.id >= Poste.QUANTIDADE_POSTES");
		
		return mapa[casa.id][poste.id];
	}

}
