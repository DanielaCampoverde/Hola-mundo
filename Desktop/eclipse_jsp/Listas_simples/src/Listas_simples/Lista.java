package Listas_simples;

public class Lista {
	// Daniela Campoverde

	private Nodo inicio;
	private Nodo fin;

	public Lista() {
		inicio = fin = null;
	}

	public void listaVacia() {
		Nodo aux = inicio;
		if (aux == null) {
			System.out.println("Lista vacia");
		} else {
			System.out.println("La lista no esta vacia");
		}
	}

	public void insertar(int num) {
		inicio = new Nodo(num, inicio);
		if (fin == null) {
			fin = inicio;
		}
	}

	public void mostarLista() {
		Nodo aux = inicio;
		if (aux == null) {
			System.out.println("Lista vacia");
		}
		while (aux != null) {
			System.out.print("[" + aux.elemento + "]=>");
			aux = aux.siguiente;
		}
		System.out.println();
	}

	public void buscar(int num) {
		Nodo aux = inicio;
		if (aux == null) {
			System.out.println("Lista vacia");
		}
		while (aux != null) {
			if (aux.elemento == num) {
				System.out.println("Encontrado");
				break;
			} else {
				System.out.println("Elemento no encontrado");
				break;
			}
		}
	}

	public boolean estavacio() {
		return (inicio == null);
	}

	public int eliminar() {
		Nodo aux = inicio;
		if (aux == null) {
			System.out.println("Lista vacia");
		}
		if (estavacio()) {
			inicio = null;
		}
		if (inicio != null) {
			int info = inicio.elemento;
			inicio = inicio.siguiente;
			return info;
		}
		return 0;
	}

}
