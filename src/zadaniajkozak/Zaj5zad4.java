/**
4. Napisać funkcję
String flipCase(String text)
, która zamieni małe litery na
duże i odwrotnie w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch
znaków zawierający kopię łańcucha po zmianie wielkości liter.
*/

package zadaniajkozak;

import java.util.Scanner;

public class Zaj5zad4 {
    
    String flipCase(String text){
        String text2 = "";
        String abc = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ "; //25
        int endText = text.length();
        for(int x=0; x<endText; x++){
            for(int y=0; y<51; y++){
                if(text.substring(x,x+1).equals(abc.substring(y,y+1))){
                    if(y==50){text2+=" ";}
                    if(y<25){text2+=abc.substring(y+25,y+26);}
                    if(y>24&&y<50){text2+=abc.substring(y-25,y-24);}    
                }
                /**else{
                    if(y==50){text2+= abc.substring(x,x+1);}
                }*/ //nie działa
                
            }
            
        }
        
        
        return text2;
    }
    
    public static void zadanie(){
        System.out.println("54. Funkcja/metdoda flipCase odwracajaca wielkość liter w łańcuchu.");
        System.out.println();
        System.out.print("Podaj tekst: ");
        Scanner odczyt = new Scanner(System.in);
        String tekst = odczyt.nextLine();
        Zaj5zad4 tekst2 = new Zaj5zad4();
        System.out.println("Podany tekst z odwróconą wielkością liter: " + tekst2.flipCase(tekst) );

    
    }
    
}
