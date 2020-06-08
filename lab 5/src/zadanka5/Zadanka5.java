
package zadanka5;


public class Zadanka5 {

    
    public static void main(String[] args) {
       temperatura tmp = new temperatura();
        System.out.println(tmp.porownaj(125, 15));
        liczby numb = new liczby();
        int [] tab = {1,15,14,2,1,2,3};
        System.out.println(numb.sekwencja(tab));
        polowa half = new polowa();
        System.out.println(half.ciag("Lubie bardzo lody"));
        odwrotnaa odw = new odwrotnaa();
        System.out.println(odw.odwroc(tab));
    }
    
}
