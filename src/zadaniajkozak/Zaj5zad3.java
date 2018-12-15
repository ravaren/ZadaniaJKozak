/**
3. Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks
na którym znajduje się znak z (drugi parametr) w podanym łańcuchu text .
Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1.
Uwaga - pozycje znaków numerujemy począwszy od 0.
*/
package zadaniajkozak;

import java.util.Scanner;

public class Zaj5zad3{
    
    public int strpos(String text, char z){
    int indeks = -1;    
    
    int limit = text.length();
    for(int x = 0; x < limit; x++){
        if(text.charAt(x) == z){indeks = x+1;}    
    }
    
    return indeks;    
    }
    
    public static void zadanie(){
        System.out.println("53. Funkcja strpos - która zwraca indeks znaku w łańcuchu.");
        System.out.print("Podaj tekst: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        System.out.print("Podaj poszukiwany znak: ");
        char znak = odczyt.next().charAt(0);
        Zaj5zad3 indeks = new Zaj5zad3();
        int wynik = indeks.strpos(tekst, znak);
        if(wynik == -1){System.out.println("W podanym tekscie znak " + znak + " NIE występuje!");}
        else{System.out.println("W podanym tekscie znak " + znak + " występuje na pozycji: " + wynik);}
        
        
        
    }
}
