/**
14. Napisać funkcję boolean czyAnagram(String t1, String t2) , która spraw-
dza, czy łańcuch t2 jest anagramem tekstu t1 , czyli czy składa się z tych
samych znaków, ale ustawionych niekoniecznie w tej samej kolejności
Uwaga, należy sprawdzać jedynie małe i duże litery alfabetu angielskiego, jednak
bez względu na ich wielkość, tzn. zarówno małe ’a’ jak i duże ’A’ liczone są tak
samo. Pozostałe znaki nie są sprawdzane, a więc nie mają wpływu na to, czy
słowo będzie uznane za anagram innego.
Przykładowo, dla poniższego fragmentu programu:
System.out.println(czyAnagram("kolej","olejk"));
System.out.println(czyAnagram("kolej","kole"));
System.out.println(czyAnagram("kolej","K O L E J"));
System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
na ekranie powinno zostać wyświetlone:
true
false
true
true
*/
package zadaniajkozak;

import java.util.Scanner;

public class Zaj15zad14bis {
    
    
    static boolean czyAnagram(String t1, String t2){
        boolean result = false;
        
        char[] tekst1 = (t1.toUpperCase()).toCharArray();
        char[] tekst2 = (t2.toUpperCase()).toCharArray();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] abc = alphabet.toCharArray();
        int[] licznik1 = new int[26];
        int[] licznik2 = new int[26];
        
        //ZLICZANIE LITEREK DLA PIERWSZEJ TABLICY
        for(int x=0;x<tekst1.length;x++){
            for(int a=0;a<26;a++){
                if(tekst1[x] == abc[a]){licznik1[a]++;}
            }
        }
        
        //ZLICZNIE LITEREK DLA DRUGIEJ TABLICY
        for(int x=0;x<tekst2.length;x++){
            for(int a=0;a<26;a++){
                if(tekst2[x] == abc[a]){licznik2[a]++;}
            }
        }
        
        //Porównanie tablic z iloscia znalezionych liter
        for(int z=0; z<26; z++){
            if(licznik1[z]!=licznik2[z]){
                result = false;
                break;
            }
            else if(z==25){
                result = true;
            }
        }
        
        return result;
    }
    
    
    
    public static void main(String[] args){
    
        System.out.println(czyAnagram("kolej","olejk"));
        System.out.println(czyAnagram("kolej","kole"));
        System.out.println(czyAnagram("kolej","K O L E J"));
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
        System.out.println();
        System.out.println(czyAnagram("test","testy"));
        
        Scanner odczyt = new Scanner(System.in);
        String txt1;
        String txt2;
        while(true){
            System.out.print(" Podaj pierwszy wyraz: ");
            txt1 = odczyt.nextLine();
            if(txt1.equals("exit")){break;}
            System.out.print(" Podaj drugi wyraz: ");
            txt2 = odczyt.nextLine();
            if(txt2.equals("exit")){break;}
            System.out.println("Wynik testu \"czyAnagram\" dla tych wyrazów: " + czyAnagram(txt1, txt2) + "\n" + "########################" + "\n\n\n" );
        }
        
    }
}
