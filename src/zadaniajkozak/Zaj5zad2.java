/**
*   2.  Napisz funkcję, która zwraca wartość n-tego wyrazu ciągu Fibonacciego. 
*       Funkcja powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
*/
package zadaniajkozak;

/**
 *
 * @author radek
 */
import java.util.Scanner;

public class Zaj5zad2 {
    
    public int iteracja(int n){
        if(n==0){return 0;}
        if(n==1){return 1;}
        else{
            int el1 = 0;
            int el2 = 1;
            for(int x = 1; x<n; x++ ){
                el2+=el1;
                el1=el2-el1;
            }
            return el2;
        }
    }
    public int rekurencja(int n){
        int wynik = n;
        if(n==0){return 0;}
        if(n==1){return 1;}
        else{
        wynik = rekurencja(n-1) + rekurencja(n-2);
        }
    return wynik;
    }
    
    public static void zadanie() {
        System.out.println("52. Ciag Fibonacciego. Iteracyjnie i rekurencyjnie.");
        int n;
        do{
        System.out.print("Podaj liczbę n: ");
        Scanner odczyt = new Scanner(System.in);
        n = odczyt.nextInt();
        if(n<0){System.out.println("Błąd podaj jeszcze raz: ");}
        }while(n<0);
        Zaj5zad2 fibo = new Zaj5zad2();
        System.out.println(fibo.iteracja(n));
        System.out.println(fibo.rekurencja(n));
    }
}
