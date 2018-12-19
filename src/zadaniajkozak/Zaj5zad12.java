/**
12. Napisać program, który wykorzystując część z zaimplementowanych wcześniej
funkcji wyznacza:
• Sumę wszystkich liczb znajdujących się w tablicy (jako liczbę traktuje się
łańcuch, którego początkiem jest liczba - format jak w funkcji strToInt().
• Łańcuch będący połączeniem wszystkich komórek tablicy, których wartość
łańcucha nie jest liczbą (definicja liczby analogiczna do pkt. 1).
• Liczbę wystąpień określonej frazy we wszystkich komórkach „nieliczbowych” tablicy.
• Liczbę wystąpień określonej frazy w łańcuchu, o którym mowa w pkt. 2.
• Stosunek wystąpień frazy w komórkach tablicy (pkt. 3) do liczby wystąpień w powstałym łańcuchu (pkt. 4).
Przykład:
Tablica, o której mowa w zadaniu:
zadania[N][M]={"mamla", " mama ", "+12", "0001", "991-234-3",
"-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};
// gdzie N=M=10;
Szukana fraza:
f[N]="ma";
Wynik wyświetlony na konsolę:
Pkt. 1: -1199008
Pkt. 2: mamla mama +zonmakmax2amakotma
Pkt. 3: 6
Pkt. 4: 7
Pkt. 5: 0.857143
*/

package zadaniajkozak;


public class Zaj5zad12 {
    
    
    void przyklad1(String[][] zadania){
        int n = 0;
        Zaj5zad6 liczby = new Zaj5zad6();
        for(int x=0;x<10;x++){
            n+=liczby.strToInt(zadania[x][x]);
            
        }
        System.out.println(n);
    }
    
    public void zadanie(){
        String[][] zadania = new String[10][10];
        String[] preTab = {"mamla", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};
        
        for(int x=0;x<10;x++){
            zadania[x][x] = preTab[x];
        }
        
        
        System.out.println("512. Program wykorzystujący poprzednie funkcje do przeprowadzenia bezsensownych zadań.");
        System.out.println();
        Zaj5zad12 wyniki = new Zaj5zad12();
        System.out.println("*******************************************");
        System.out.println("Dla przykładu 1 (ma być -1199008): ");
        wyniki.przyklad1(zadania);
        System.out.println("*******************************************");
        System.out.println();
        
    }
    
}
