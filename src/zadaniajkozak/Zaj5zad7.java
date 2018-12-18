/**
7. Zdefiniować funkcję int strfind(String gdzie, String co), która szuka łańcucha
co w łańcuchu gdzie i jeżeli go znajdzie, to jej wynikiem jest pozycja, na której 
ten łańcuch zaczyna się w łańcuchu gdzie. Jeżeli nie udało się znaleźćłańcucha 
to wtedy wynikiem ma być -1.

Przykłady:
strfind("Ala ma kota", "ma") - wynik to 4
strfind("Ala ma kota", "Ala ma kota") - wynik to 0
strfind("Ala ma kota", "") - wynik to 0, bo pusty łańcuch jest
podłańcuchem każdego innego łańcucha
strfind("Pies", "jakis napis") - wynik to -1
strfind("Ala ma kota", "pies") - wynik to -1
*/
package zadaniajkozak;
import java.util.Scanner;
public class Zaj5zad7 {
    
    int strfind(String gdzie, String co){
        int indeks = -1;
        
        return indeks;
    }
    public static void zadanie(){
        System.out.println("57. Funkcja/metoda strFind szuka podanego łańcucha w drugim łańcuchu.");
        System.out.println();
        System.out.print("Podaj przeszukiwany tekst: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        System.out.print("Podaj szukaną fraze: ");
        String szukane = odczyt.nextLine();
        
        Zaj5zad7 wynik = new Zaj5zad7();
        
        System.out.println("Podana fraza zaczyna się na indeksie: ");
        System.out.println("Dla standardowej metody indexOf: " + tekst.indexOf(szukane));
        System.out.println("Dla mojej metody strfind: " + wynik.strfind(tekst, szukane));
        
        System.out.println("strfind(\"Ala ma kota\", \"ma\") - wynik to 4 = " + wynik.strfind("Ala ma kota", "ma"));
        System.out.println("strfind(\"Ala ma kota\", \"Ala ma kota\") - wynik to 0 = " + wynik.strfind("Ala ma kota", "Ala ma kota"));
        System.out.println("strfind(\"Ala ma kota\", \"\") - wynik to 0 = " + wynik.strfind("Ala ma kota", ""));
        System.out.println("strfind(\"Pies\", \"jakis napis\") - wynik to -1 = " + wynik.strfind("Pies", "jakis napis"));
        System.out.println("strfind(\"Ala ma kota\", \"pies\") - wynik to -1 = " + wynik.strfind("Ala ma kota", "pies"));
    }
}
