/**
9. Napisać funkcję String[] podzielNaSlowa(String tekst), która dzieli podany 
tekst na słowa i zapisuje je w tablicy. Wynikiem funkcji jest tablica zawierające
kolejno słowa z tekstu. Za słowo przyjmujemy każdy ciąg znaków niezawierający
białego znaku.
*/
package zadaniajkozak;

import java.util.Scanner;

public class Zaj5zad9 {
    
    String[] podzielNaSlowa(String tekst){
        
        Zaj5zad8 licznik = new Zaj5zad8();
        String[] tablicaWyr = new String[licznik.wordCount(tekst)];
        int startSlowa = -1;
        int koniecSlowa;
        boolean slowo = false;
        int elTab = 0;
        
        for(int x=0; x<tekst.length();x++){
            
            if(!tekst.substring(x,x+1).equals(" ")&&!slowo){
                slowo = true;
                startSlowa = x;
                         
                
            }
            
            if(tekst.substring(x,x+1).equals(" ")&&slowo){  //jeśli natrafi na pusty znak i slowo bylo rozpoczete
                slowo = false;                              //kończy tryb wprowadzania slowa
                koniecSlowa = x;//być może x+1              //wyznacza zakończenie
                tablicaWyr[elTab] = tekst.substring(startSlowa,koniecSlowa);
                System.out.println(tablicaWyr[elTab]);
                elTab++;
            }
            if(x+1==tekst.length()&&slowo){                   //Dodatkowy warunek na wypadek gdyby łańcuch nie był zakończony spacją
                slowo = false;                              //kończy tryb wprowadzania slowa
                koniecSlowa = x+1;                             //wyznacza zakończenie
                tablicaWyr[elTab] = tekst.substring(startSlowa,koniecSlowa);
                System.out.println(tablicaWyr[elTab]);
                elTab++;
            }
            
        }
        
        
        return tablicaWyr;
    }
    public void zadanie(){
        System.out.println("59. Metoda podzielNaSlowa - dzieli tekst na słowa");
        System.out.println();
        System.out.print("Podaj tekst: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        
        podzielNaSlowa(tekst);
        
        
        
    }
    
}
