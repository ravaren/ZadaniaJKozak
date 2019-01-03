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
        System.out.println("58. Metoda wordCount - liczy ilość wyrazów w podanym tekście");
        System.out.println("59. Metoda funkcja podzielNaSlowa - dzieli tekst na słowa");
        System.out.println("510. Metoda strFindAndCount - szuka i zlicza wystąpienia podanej frazy w danym łańcuchu.");
        System.out.println("511. Procedura strcut - wycina z łańcucha okreslony fragment.");
        System.out.println("512. Program wykorzystujący poprzednie funkcje do przeprowadzenia bezsensownych zadań.");
        System.out.println("513. Program przestawiajacy łańcuch w podanej kolejnośći.");
        System.out.println();
        System.out.print("Wybierz ćwiczenie do uruchomienia: ");
        System.out.println();
        Scanner odczyt = new Scanner(System.in);
        //int wybor = odczyt.nextInt();
        int wybor = 513;
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
            case 58:    Zaj5zad8 zadanie58 = new Zaj5zad8(); 
                        zadanie58.zadanie();
                        break;  
            case 59:    Zaj5zad9 zadanie59 = new Zaj5zad9(); 
                        zadanie59.zadanie();
                        break; 
            case 510:   Zaj5zad10 zadanie510 = new Zaj5zad10(); 
                        zadanie510.zadanie();
                        break;  
            case 511:   Zaj5zad11 zadanie511 = new Zaj5zad11(); 
                        zadanie511.zadanie();
                        break;
            case 512:   Zaj5zad12 zadanie512 = new Zaj5zad12(); 
                        zadanie512.zadanie();
                        break;
            case 513:   Zaj5zad13 zadanie513 = new Zaj5zad13(); 
                        zadanie513.zadanie();
                        break;
        }
            
        
    }
    
    
}
