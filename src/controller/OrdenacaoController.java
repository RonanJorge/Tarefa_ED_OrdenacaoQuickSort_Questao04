package controller;

public class OrdenacaoController {
	public OrdenacaoController() {
		super();
	}
	
	public int[] quicksort(int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int posicaoPivoFixo = dividir(vetor, inicio, fim);
			quicksort(vetor, inicio, posicaoPivoFixo - 1);
			quicksort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	
	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vetor[inicio];
		
		while(ponteiroEsquerda <= ponteiroDireita) {
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda ++;
			}
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroDireita] >= pivo) {
				ponteiroDireita --;
			}
			if(ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda ++;
				ponteiroDireita --;
			}
		}
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	
	private void trocar(int[] vetor, int i, int j) {
		int auxiliar = vetor[j];
		vetor[j] = vetor[i];
		vetor[i] = auxiliar;
	}
}

