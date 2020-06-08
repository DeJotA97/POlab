
package zadanka5;


public class liczby {
    public boolean sekwencja(int [] tab){
        for (int x=0; x<tab.length -2; x++){
            if (tab[x]==1 & tab[x+1]==2 & tab[x+2]==3){
            return true;}
        }
        return false;
    }
    
}
