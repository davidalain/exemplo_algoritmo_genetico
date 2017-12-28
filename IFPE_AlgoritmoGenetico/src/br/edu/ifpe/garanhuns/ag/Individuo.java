package br.edu.ifpe.garanhuns.ag;

import java.util.Arrays;

import problema.CasaCliente;
import problema.Conexao;

public class Individuo<T> implements Comparable<Individuo>{
	
	private Conexao[] cromossomo;
	private double fitness;
	
	public Individuo(int quantidadeCasaClientes){
		this.cromossomo = new Conexao[quantidadeCasaClientes];
	}
	
	public void avalia(){
		
		double fitnessTemp = 0.0;
		for(int i = 0 ; i < cromossomo.length ; i++){
			fitnessTemp += cromossomo[i].distancia();
		}
		
		fitness =  fitnessTemp;
	}

	@Override
	public int compareTo(Individuo o) {
		if(this.fitness > o.fitness)
			return -1; //Para ordenar de maneira decrescente
		if(this.fitness < o.fitness)
			return 1; //Para ordenar de maneira decrescente
		return 0;
	}

	public Conexao[] getCromossomo() {
		return cromossomo;
	}

	public void setCromossomo(Conexao[] cromossomo) {
		this.cromossomo = cromossomo;
	}

	public double getFitness() {
		return fitness;
	}
	
	public String toString(){
		return "(cromosso={"+Arrays.toString(cromossomo)+"}, fitness=" + fitness + ")";
	}
	
	
	
}
