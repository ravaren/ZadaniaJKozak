/**
	2. 	Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie two-
		rzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
		Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.
*/

package zadaniajkozak;

import java.util.Scanner;



public class Zaj4zad2{
	public static void zadanie(){
		
                System.out.println("42. Kot - tok. Wyrazy od tyłu.");
                System.out.print("Podaj wyraz: ");
		Scanner odczyt = new Scanner(System.in);
		String tekst = odczyt.nextLine();
		String tekst2= "";
		int t = tekst.length();
		
		while(t>0){
			tekst2 = tekst2+(tekst.substring(t-1,t));
			//System.out.println(tekst.substring(t-1,t));
			t--;
		}
		System.out.println("Odwrócony wyraz: " + tekst2);
	}
}
