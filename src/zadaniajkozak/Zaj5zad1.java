/**
1. Napisz funkcję, która zwraca wartość silni dla podanej liczby n. 
Funkcja powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
*/

package zadaniajkozak;


import java.util.Scanner;

public class Zaj5zad1{
	
	public int rekurencja(int n){
			if(n>1){n*=rekurencja(n-1);}
			return n;
	}
	
	public int iteracja(int n){
			int silnia = 1;
			for(int x = n; x>0; x--){silnia*=x;}
			return silnia;
	}
	
	
	public static void zadanie(){
		System.out.println("51. Silnia iteracyjnie i rekurencyjnie.");
		System.out.print("Podaj liczbę n: ");
		Scanner odczyt = new Scanner(System.in);
		int n = odczyt.nextInt();
		Zaj5zad1 silnia = new Zaj5zad1();
		System.out.print("Silnia rekurencyjnie: "+ silnia.rekurencja(n)+ "\n");
		
		System.out.println("Silnia iteracyjnie: " + silnia.iteracja(n)); 
		
		
		
	}
}
