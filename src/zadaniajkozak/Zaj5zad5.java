/**
 * 5. Zdefiniować funkcję
boolean startsWith(String str1, String str2)
, która
sprawdza, czy łańcuch
str2
jest prefiksem łańcucha
str1
.
Przykłady:
startsWith("Alibaba", "Ali") - wynik true, ponieważ wyraz
"Alibaba" zaczyna się wyrazem "Ali".
startsWith("Alibaba", "Alibaba") - wynik true, ponieważ wyraz jest
zawsze swoim prefiksem.
startsWith("Kot", "Pies") - wynik false, ponieważ wyraz "Pies"
nie jest prefiksem wyrazu "Kot"
 */
package zadaniajkozak;

import java.util.Scanner;

public class Zaj5zad5{
	boolean ifstartsWith(String str1, String str2){
            boolean wynik;
            if(str1.startsWith(str2, 0)){wynik = true;}
            else{wynik = false;}
            return wynik;
	}
	
	public static void zadanie(){
            System.out.println("55. Funkcja/metdoda startsWith - sprawdza czy tekst zaczyna sie danym prefiksem.");
            Scanner odczyt = new Scanner(System.in);
            System.out.print("Podaj tekst: ");
            String tekst = odczyt.nextLine();
            System.out.print("Podaj prefiks: ");
            String prefiks = odczyt.nextLine();
            Zaj5zad5 test = new Zaj5zad5();
            if(test.ifstartsWith(tekst, prefiks)==true){
                System.out.print("PRAWDA: " + prefiks + " jest prefiksem " + tekst + ".");
            }
            else{
                System.out.print("FAŁSZ: " + prefiks + " NIE jest prefiksem " + tekst + ".");
            }
	}
}