/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniajkozak;
import java.util.Scanner;
/**
 *
 * @author radek
 */
public class ZadaniaJKozak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("41. „Abrakadabra” - ile razy ostatnia litera występuje.");
        System.out.println("42. Kot - tok. Wyrazy od tyłu.");
        System.out.println();
        System.out.println("51. Silnia. Iteracyjnie i rekurencyjnie.");
        System.out.println("52. Ciag Fibonacciego. Iteracyjnie i rekurencyjnie.");
        System.out.println("53. Funkcja/metoda strpos - która zwraca indeks znaku w łańcuchu.");
        System.out.println("54. Funkcja/metdoda flipCase odwracajaca wielkość liter w łańcuchu.");
        System.out.println("55. Funkcja/metdoda startsWith - sprawdza czy tekst zaczyna sie danym prefiksem.");
        System.out.println("56. Funkcja strToInt - wyciąga liczbe całkowitą z łańcucha.");
        System.out.println("57. Funkcja/metoda strFind szuka podanego łańcucha w drugim łańcuchu.");
        System.out.println();
        System.out.print("Wybierz ćwiczenie do uruchomienia: ");
        System.out.println();
        Scanner odczyt = new Scanner(System.in);
        //int wybor = odczyt.nextInt();
        int wybor = 57;
        switch(wybor){
            
            case 41:    Zaj4zad1 zadanie41 = new Zaj4zad1(); 
                        zadanie41.zadanie();
                        break;
            case 42:    Zaj4zad2 zadanie42 = new Zaj4zad2(); 
                        zadanie42.zadanie();
                        break;           
                        
            case 51:    Zaj5zad1 zadanie51 = new Zaj5zad1(); 
                        zadanie51.zadanie();
                        break;
            case 52:    Zaj5zad2 zadanie52 = new Zaj5zad2(); 
                        zadanie52.zadanie();
                        break;
            case 53:    Zaj5zad3 zadanie53 = new Zaj5zad3(); 
                        zadanie53.zadanie();
                        break;
            case 54:    Zaj5zad4 zadanie54 = new Zaj5zad4(); 
                        zadanie54.zadanie();
                        break;
            case 55:    Zaj5zad5 zadanie55 = new Zaj5zad5(); 
                        zadanie55.zadanie();
                        break;
            case 56:    Zaj5zad6 zadanie56 = new Zaj5zad6(); 
                        zadanie56.zadanie();
                        break;
            case 57:    Zaj5zad7 zadanie57 = new Zaj5zad7(); 
                        zadanie57.zadanie();
                        break;            
        }
            
        
    }
    
    
}
