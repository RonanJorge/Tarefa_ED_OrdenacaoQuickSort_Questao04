package view;

import controller.OrdenacaoController;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		OrdenacaoController ordenacao = new OrdenacaoController();
		vetor = ordenacao.quicksort(vetor, 0, vetor.length - 1);
		
		for(int valor: vetor) {
			System.out.print(valor + " ");
		}
	}

}