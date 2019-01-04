/*
15. W języku HTML oraz kaskadowych arkuszach stylów (CSS) powszechne jest usta-
lanie kolorów elementów w postaci łańcucha #RRGGBB, gdzie RR jest dwucyfrową
liczbą (od 0x0 do 0xFF) w kodzie szesnastkowym oznaczającą ile czerwieni jest
w wynikowym kolorze. Analogicznie GG oznacza nasycenie zieleni, a BB niebie-
skiego.
Napisać funkcję int [] HTMLColor2RGB(String color) , która jako parametr
przyjmuje łańcuch postaci ”#RRGGBB” i zwraca tablicę 3 liczb całkowitych w
systemie 10 oznaczających nasycenie poszczególnych składowych.
Przykład
Wynikiem HTMLColor2RGB("#FF0050") powinna być tablica { 255, 0, 80 }.
Wynikiem HTMLColor2RGB("#001020") powinna być tablica { 0, 16, 32 }.
 */


package zadaniajkozak;


public class Zaj5zad15 {
    
    int [] HTMLColor2RGB(String color){
        int [] tablica = new int [3];
        String hexy = "0123456789ABCDEF";
        int nrcolor = 0;
        int [] zapisdziesietny = new int [6];
        for(int x=1;x<7;x++){
            for(int y=0;y<16;y++){
                if(color.substring(x,x+1).equals(hexy.substring(y,y+1))){
                    zapisdziesietny[nrcolor]=y;
                    nrcolor++;
                }
            }
        }
        
        int test = 0;
        
        for(int x=0;x<3;x++){
                       
            tablica[x] = zapisdziesietny[test]*16 + zapisdziesietny[test+1];
            test+=2;
        }
        
        return tablica;
    }
    
    
    public void zadanie(){
        
        System.out.println("Powinno być { 255, 0, 80 }: {" + HTMLColor2RGB("#FF0050")[0] + ", " + HTMLColor2RGB("#FF0050")[1] + ", " + HTMLColor2RGB("#FF0050")[2] + "}");
        //HTMLColor2RGB("#FF0050");
        System.out.println("Powinno być { 0, 16, 32 }: {" + HTMLColor2RGB("#001020")[0] + ", " + HTMLColor2RGB("#001020")[1] + ", " + HTMLColor2RGB("#001020")[2] + "}");
        //HTMLColor2RGB("#001020");
        
    }
    
}
