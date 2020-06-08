
package zadanka5;


public class odwrotnaa {
    public static String  odwroc (int [] tab){
        int dlugosc = tab.length;
        String nowa = "";
        for (int x=0;x<dlugosc;x++){
            nowa+=tab[dlugosc-x-1];
        }
        return nowa;
    }
}
