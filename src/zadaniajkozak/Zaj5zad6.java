/**
 * 6. Zdefiniować funkcję int strToInt(String str), która zamienia liczbę całko-
witą zapisaną w postaci łańcucha na liczbę całkowitą typu int. Funkcja powinna
przerywać konwersję w momencie napotkania pierwszego znaku nie należącego do
zapisu liczby, zatem np. dla
strToInt("-13krowa")
wynikiem powinno być -13.
Pozostałe przykłady:
11
strToInt("+12") - wynik 12
strToInt("0001") - wynik 1
strToInt("991-234-23") - wynik 991
strToInt("+zonk") - wynik 0
strToInt("") - wynik 0
strToInt("-12e5") - wynik -12*10^5 = -120000
strToInt("-12e-5") - wynik -12, tylko dodatnie wykładniki są rozpatrywane
 */

package zadaniajkozak;

import java.util.Scanner;

public class Zaj5zad6 {
    public int strToInt(String str){
        int liczba = 0;
        String integers = "0123456789";
        int x=0;
        boolean policzbie = false;
        do{
            for(int y=0; y<10; y++){
                if(str.substring(x,x+1).equals(integers.substring(y,y+1))==false && policzbie==true){
                    x+=10;
                    break;
                }
                if(str.substring(x,x+1).equals(integers.substring(y,y+1))){
                    liczba = (liczba*10)+y;
                    policzbie = true;
                }
            }
            x++;
        }while(x<str.length());
            
        
        return liczba;
    }
    
    public static void zadanie(){
        System.out.println("56. Funkcja strToInt - wyciąga liczbe całkowitą z łańcucha.");
        System.out.print("Podaj tekst w którym ma zostać znaleziona liczba całkowita: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        Zaj5zad6 wynik = new Zaj5zad6();
        System.out.print("Liczba całkowita znaleziona w podanym łańuchu wynosi: " + wynik.strToInt(tekst));
        
        
        
    }
}
