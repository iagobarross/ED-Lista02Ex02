package view;

import model.*;

public class Principal {

	public static void main(String[] args) {
		ILista<Integer> lista = new Lista<>();
		ILista<Integer> auxiliar = new Lista<>();

		try {
			lista.addLast(10);
			lista.addLast(5);
			lista.addLast(8);
			lista.addLast(1);
			lista.addLast(9);
			lista.addLast(2);
			lista.addLast(4);
			lista.addLast(7);
			lista.addLast(3);
			lista.addLast(6);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		int tamanho = lista.size();
		System.out.println("Lista Original:");
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

		try {
			for (int i = 0; i < tamanho - 1; i++) {
				for (int j = (i + 1); j < tamanho; j++) {
					if (lista.get(i) > lista.get(j)) {
						auxiliar.addLast(lista.get(j));
						lista.remove(j);
						lista.add(auxiliar.get(0), i);
						auxiliar.clean();
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\nLista Ordenada:");
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
