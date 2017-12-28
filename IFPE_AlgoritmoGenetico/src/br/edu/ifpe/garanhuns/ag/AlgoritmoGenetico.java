package br.edu.ifpe.garanhuns.ag;

import java.util.Arrays;
import java.util.Random;

public class AlgoritmoGenetico<I> {
	
	private static final double percentualMutacao = 0.2;
	private static final double percentualSelecao = 0.5;
	
	private static final int quantidadeCasasCliente = 15;
	
	private Random random;
	private Individuo[] populacao;
	private int tamanhoPopulacao;

	public AlgoritmoGenetico(int tamanhoPopulacao){
		this.random =  new Random();
		this.tamanhoPopulacao = tamanhoPopulacao;
	}
	
	public void roda(int quantidadeIteracoes){
		
		//Cria a população
		this.populacao = new Individuo[this.tamanhoPopulacao];
		for(int i = 0 ; i < populacao.length ; i++){
			this.populacao[i] = new Individuo(quantidadeCasasCliente * 2);
		}
		
		
		for(int i = 0 ; i < quantidadeIteracoes ; i++){
			selecao(populacao);
			reproducao(populacao);
			mutacao(populacao);
		}
		
		System.out.println(Arrays.toString(populacao));
		
		
	}
	
	private int qtdIndividuosMutacao(){
		return (int)(percentualMutacao * (double)populacao.length);
	}
	
	private int qtdIndividuosSelecao(){
		return (int)(percentualSelecao * (double)populacao.length);
	}

	private void mutacao(Individuo[] populacao){
		
		int qtdIndividuos = qtdIndividuosMutacao();
		for(int qtd = 0 ; qtd < qtdIndividuos ; qtd++){

			int indice = random.nextInt(populacao.length);
			populacao[indice] = muta(populacao[indice]);
		}

	}

	private void selecao(Individuo[] populacao){
		
		for(Individuo individuo : populacao){
			individuo.avalia();
		}
		
		Arrays.sort(populacao);
	}

	private void reproducao(Individuo[] populacao){

		int qtdIndividuos = qtdIndividuosSelecao();
		
		for(int i = qtdIndividuos ; i < populacao.length ; i++){
			
			int indice1 = random.nextInt(qtdIndividuos);
			int indice2 = random.nextInt(qtdIndividuos);
			populacao[i] = reproduz(populacao[indice1], populacao[indice2]);
		}

	}
	
	private Individuo muta(Individuo individuo){
		return null;
	}
	

	private Individuo reproduz(Individuo i1, Individuo i2){
		return null;
	}
}
