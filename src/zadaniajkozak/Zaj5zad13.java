/**
13. Napisać funkcję String poprzestawiaj(String tekst, int [] kolejnosc) ,
której wynikiem jest łańcuch złożony ze znaków w zmiennej tekst ułożonych wg
kolejności podanej w tablicy kolejnosc , tzn. i-ty znak tekstu powinien znaleźć
się w wynikowym łańcuchu na pozycji kolejnosc[i] .
Przykład, dla poniższego wywołania funkcji:
13String tekst = "Egzamin";
int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
System.out.println(poprzestawiaj(tekst, kol));
wynikiem powinien być łańcuch:
Egmazni
*/
package zadaniajkozak;


public class Zaj5zad13 {
    
    String poprzestawiaj(String tekst, int [] kolejnosc){
        
        String wynik = "";
        
        for(int x=0; x<tekst.length();x++){            
                    wynik+=tekst.substring(kolejnosc[x],++kolejnosc[x]);    
        }        
        return wynik;
    }
    
    public void zadanie(){
    
        String tekst = "Egzamin";
        int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
        
        System.out.println(" Wynikiem powinien być łańcuch: Egmazni, a jest: " + poprzestawiaj(tekst, kol));
        
    }
}
