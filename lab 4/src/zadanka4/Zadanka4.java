
package zadanka4;
import java.util.Scanner ;

public class Zadanka4 {

    
    public static void main(String[] args) {
        //Zad 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        String liczba = scan.nextLine();
        try {
            int l = Integer.parseInt(liczba);
        }
        catch(NumberFormatException exception) {
            System.out.println("Nie podano liczby!");
        }
        
        // Zad 3
        
        int [] tab = new int [25];
        for (int x=0; x<tab.length; x++){
            tab[x]=x*25;
        }
        System.out.println("Podaj ktory element tablicy chcesz wyswietlic, pamietaj, że ma 25 elementow");
        
        String element=scan.nextLine();
        try {
        int elementTablicy=Integer.parseInt(element);
        System.out.println("Podany element tablicy "+ tab[elementTablicy-1] );  
        
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException exceptions){
            System.out.println("Przykro mi, nie ma podanego indeksu w tablicy" );
        }
        finally {
            System.out.println("Program zakonczyl dzialanie");
        }
    }
    
}
