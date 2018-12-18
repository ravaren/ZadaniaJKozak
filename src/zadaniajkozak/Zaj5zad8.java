/** 8. Napisać funkcję int wordCount(String text), której wynikiem jest liczba wszyst-
    kich słów występujących w podanym jako parametr tekście. Do sprawdzania, czy dany 
    znak tekstu jest „białym znakiem” można zastosować metodę Character.isWhitespace. 
    Za słowo przyjmujemy każdy ciąg znaków niezawierający białego znaku.
*/
package zadaniajkozak;
import java.util.Scanner;
public class Zaj5zad8 {
    int wordCount(String text){
        int n = 0;
        boolean Slowo = false;
        for(int x=0; x<text.length();x++){
            if(text.substring(x,x+1).equals(" ")&&Slowo){Slowo=false;}
            if(!text.substring(x,x+1).equals(" ")&&!Slowo){Slowo=true;n++;}
            //else{Slowo=true;};
        }
        return n;
    }
    public void zadanie(){
        System.out.println("58. Metoda wordCount - liczy ilość wyrazów w podanym tekście");
        System.out.print("Podaj tekst dla którego ma zostać policzona ilość wyrazów: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        Zaj5zad8 kalki = new Zaj5zad8();
        System.out.println("Ilość wyrazów w tym tekście wynosi: " + kalki.wordCount(tekst));
        
    }
}
