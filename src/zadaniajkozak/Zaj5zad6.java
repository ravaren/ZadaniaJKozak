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
    
    int pow(int n){
        int wynik = 1;
        for(int x = 1; x<n; x++){wynik*=10;}
        
        return wynik;
    }
    
    

    public static int strToInt(String str){
        int liczba = 0;
        String integers = "0123456789";
        int x=0;
        int limit = str.length();
        boolean policzbie = false;
        boolean minus = false;
        int test = 0;
        int test2 = 0;
        boolean wykladniczo = false;
        int wykladnik = 0;
        while(x<limit){
            for(int y=0; y<10; y++){
                
                if(str.substring(x,x+1).equals("-") && policzbie == false){minus = true; test = x+1; break;}//DLA LICZB UJEMNYCH
                if(str.substring(x,x+1).equals(integers.substring(y,y+1))==false && test == x && minus == true && y==9){minus = false; break;}//DLA LICZB UJEMNYCH
                
                if(str.substring(x,x+1).equals("e") && policzbie == true){wykladniczo = true; test2 = x+1; break;}//dla e wykładników
                if(str.substring(x,x+1).equals(integers.substring(y,y+1))==false && test2 == x && wykladniczo == true && y==9){
                    wykladniczo = false;
                    x+=10;
                    break;}//dla e wykładników
                
                
                if((str.substring(x,x+1).equals(integers.substring(y,y+1))==false) && policzbie==true && y==9){
                    x+=10;
                    break;
                }
                
                if(str.substring(x,x+1).equals(integers.substring(y,y+1))){
                    if(wykladniczo == true){
                        wykladnik = (wykladnik*10)+y;
                    }
                    else{
                        liczba = (liczba*10)+y;
                        policzbie = true;
                    }
                    
                    break;
                }
            }
            x++;
        }
        
        if(wykladniczo && wykladnik>0){
            Zaj5zad6 mnoznik = new Zaj5zad6();
            liczba *= mnoznik.pow(wykladnik);
        }
        
        if(minus){liczba*=-1;}
        
        
        return liczba;
    }
    
    public static void zadanie(){
        System.out.println("56. Funkcja strToInt - wyciąga liczbe całkowitą z łańcucha.");
        System.out.print("Podaj tekst w którym ma zostać znaleziona liczba całkowita: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        Zaj5zad6 wynik = new Zaj5zad6();
        System.out.println("Liczba całkowita znaleziona w podanym łańuchu wynosi: " + wynik.strToInt(tekst));
        System.out.println();
        
        System.out.println("Dodatkowe testowe przykłady:");
        System.out.println("+12 = " + strToInt("+12") + " (ma być: 12)");
        System.out.println("0001 = " + strToInt("0001") + " (ma być: 1)");
        System.out.println("991-234-23 = "+ strToInt("991-234-23") + " (ma być: 991)");
        System.out.println("+zonk = " + strToInt("+zonk") + " (ma być: 0)");
        System.out.println("\"" + "\" = " + strToInt("") + " (ma byc: 0)");
        System.out.println("-12e5 = " + strToInt("-12e5") + " (ma być: -120000)");
        System.out.println("-12e-5 = " + strToInt("-12e-5") + " (ma być: -12)");
        
                
    }
}
