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


public class Zaj5zad14 {
    
    
    boolean czyAnagram(String t1, String t2){
        boolean result1 = true;
        boolean result2 = true;
        boolean resultall;
        String abc = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"; 
        int [] znaczniki = new int [t2.length()];
        int znacznik = 0;
        
        for(int x = 0; x <t1.length(); x++){
            for(int y = 0; y < abc.length(); y++){
                if( t1.substring(x,x).equals(abc.substring(y,++y))){
                    for(int z = 0; z<t2.length();z++){
                        boolean flag = false;
                        if( (y%2==0) && ( t2.substring(z,++z).equals(abc.substring(y,++y)) || t2.substring(z,++z).equals(abc.substring(y+1,++y+1)) ) ){
                            flag = true;
                            break;
                        }
                        if( (y%2==1) && ( t2.substring(z,++z).equals(abc.substring(y,++y)) || t2.substring(z,++z).equals(abc.substring(y-1,y)) ) ){
                            flag = true;
                            break;
                        }
                        if(!flag){result1 = false;}
                        
                    }                  
                }
                else{
                    if(y+1==t2.length()){result1 = false;}
                }              
                
            }
        }
        
        for(int x = 0; x <t2.length(); x++){
            for(int y = 0; y < abc.length(); y++){
                if( t2.substring(x,x).equals(abc.substring(y,++y))){
                    for(int z = 0; z<t1.length();z++){
                        boolean flag = false;
                        if( (y%2==0) && ( t1.substring(z,++z).equals(abc.substring(y,++y)) || t1.substring(z,++z).equals(abc.substring(y+1,++y+1)) ) ){
                            flag = true;
                            break;
                        }
                        if( (y%2==1) && ( t1.substring(z,++z).equals(abc.substring(y,++y)) || t1.substring(z,++z).equals(abc.substring(y-1,y)) ) ){
                            flag = true;
                            break;
                        }
                        if(!flag){result2 = false;}
                        
                    }                  
                }
                else{
                    if(y+1==t2.length()){result2 = false;}
                }              
                
            }
        }
        if(result1&&result2){resultall=true;}
        else{resultall=false;}
        return resultall;
    }
    
    
    
    public void zadanie(){
    
        System.out.println(czyAnagram("kolej","olejk"));
        System.out.println(czyAnagram("kolej","kole"));
        System.out.println(czyAnagram("kolej","K O L E J"));
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
        System.out.println();
        System.out.println(czyAnagram("test","testy"));
        //if("a"=="a"){System.out.print("true");}
    }
}
