/**
10. Zdefiniować funkcję int strFindAndCount(String gdzie, String co) , która
zlicza wystąpienia łańcucha co w łańcuchu gdzie . Jej wynikiem jest wyznaczo-
na liczba wystąpień. Jeżeli nie udało się znaleźć łańcucha, to wtedy wynikiem
jest, oczywiście, 0.
Przykłady:
strFindAndCount("Ala ma kota", "ma") - wynik to 1
strFindAndCount("mama ma kota", "ma") - wynik to 3
strFindAndCount("Ala mmaa ma kota", "ma") - wynik to 2
strFindAndCount("Ala ma kota", "Asia") - wynik to 0
*/
package zadaniajkozak;

public class Zaj5zad10 {
    
    int strFindAndCount(String gdzie, String co){
        int n = 0;
        int gdzieLength = gdzie.length();
        int coLength = co.length();
        
        for(int x=0; x<=(gdzieLength - coLength);x++){
            if(gdzie.substring(x,x+coLength).equals(co)){
                n++;
                
            }
        }
        
        return n;
    }
    public void zadanie(){
        System.out.println("510. Metoda strFindAndCount - szuka i zlicza wystąpienia podanej frazy w danym łańcuchu.");
        System.out.println();
        System.out.println("strFindAndCount(\"Ala ma kota\", \"ma\") - wynik to 1 = " + strFindAndCount("Ala ma kota", "ma"));
        System.out.println("strFindAndCount(\"mama ma kota\", \"ma\") - wynik to 3 = " + strFindAndCount("mama ma kota", "ma"));
        System.out.println("strFindAndCount(\"Ala mmaa ma kota\", \"ma\") - wynik to 2 = " + strFindAndCount("Ala mmaa ma kota", "ma"));
        System.out.println("strFindAndCount(\"Ala ma kota\", \"Asia\") - wynik to 0 = " + strFindAndCount("Ala ma kota", "Asia"));        
        
    }
}
