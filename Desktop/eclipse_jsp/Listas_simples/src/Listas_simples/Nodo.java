package Listas_simples;

public class Nodo {
	// Daniela Campoverde

	public Nodo siguiente;
	public int elemento;

	public Nodo(int num) {
		this.elemento = num;
		this.siguiente = null;
	}

	public Nodo(int num, Nodo n) {
		siguiente = n;
		elemento = num;
	}

}