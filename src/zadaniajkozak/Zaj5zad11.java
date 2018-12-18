/**
11. Zdefiniować procedurę String strcut(String str, int start, int ile) , któ-
ra wycina z podanego łańcucha wszystko co znajduje się w podanym zakresie. Wy-
nikiem funkcji powinien być łańcuch bez znaków znajdujących się na pozycjach
od start do start+ile-1 .
Przykłady:
strcut("Ala ma kota", 4, 3) - wynik to "Ala kota"
strcut("Ala ma kota", 0, 4) - wynik to "ma kota"
strcut("Ala ma kota", 0, 11) - wynik to ""
*/
package zadaniajkozak;


public class Zaj5zad11 {
    String strcut(String str, int start, int ile){
        String newString = "";
        
        
        return newString;
    }
    
    public void zadanie(){
        System.out.println("511. Procedura strcut - wycina z łańcucha okreslony fragment.");
        System.out.println();
        
        System.out.println("strcut(\"Ala ma kota\", 4, 3) - wynik to \"Ala kota\" = " + strcut("Ala ma kota", 4, 3));
        System.out.println("strcut(\"Ala ma kota\", 0, 4) - wynik to \"ma kota\" = " + strcut("Ala ma kota", 0, 4));
        System.out.println("strcut(\"Ala ma kota\", 0, 11) - wynik to \"\" = " + strcut("Ala ma kota", 0, 11));
    }
}
