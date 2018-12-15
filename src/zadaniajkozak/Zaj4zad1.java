/**
 *  1. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wy-
    świetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
    Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
    ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
    razy.
 */
package zadaniajkozak;

import java.util.Scanner;

public class Zaj4zad1{
	public static void zadanie(){
			System.out.println("41. Abrakadabra - ile razy ostatnia litera występuje.");
			System.out.print("Podaj wyraz: ");
			Scanner odczyt = new Scanner(System.in);
			String tekst = odczyt.nextLine();
			int y = tekst.length();
			String literka = tekst.substring(y-1);
			int t=0;
			for(int x=0; x<y; x++){
				if(literka.equals(tekst.substring(x,x+1))){t++;}
				//System.out.println(tekst.substring(x,x+1));
			}
			
			System.out.println("Ostatni znak wyrażenia, czyli \"" +literka+ "\" występuje "+t+" raz/y.");
		
		
		
	}
}