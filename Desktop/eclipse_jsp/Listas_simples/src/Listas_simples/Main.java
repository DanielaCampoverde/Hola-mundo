package Listas_simples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Daniela Campoverde
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int elemento;
		int num;
		Lista lista = new Lista();
		do {
			System.out.println("1. Ingresar Elemento");
			System.out.println("2. Mostrar Lista");
			System.out.println("3. Eliminar");
			System.out.println("4. Buscar");
			System.out.println("5. Lista vacia o no");
			System.out.println("6. Salir");
			opcion = sc.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("Ingrese un numero");
				elemento = sc.nextInt();
				lista.insertar(elemento);
				break;
			case 2:
				lista.mostarLista();
				break;
			case 3:
				lista.eliminar();
				break;
			case 4:
				System.out.println("Ingrese el numero que desea buscar: ");
				num = sc.nextInt();
				lista.buscar(num);
				break;
			case 5:
				lista.listaVacia();
				break;
			}

		} while (opcion != 6);
	}

}
