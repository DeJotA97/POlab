
package zadanka5;


public class polowa {
    
    public String ciag(String tekst){
        int dlugosc= tekst.length();
        int polowa= dlugosc/2;
        String nowy="";
        char[] tablicaStringow = new char[tekst.length()]; 
        for (int i = 0; i < dlugosc; i++) { 
            tablicaStringow[i] = tekst.charAt(i); 
        } 
       for (int i = 0; i <= polowa; i++) {
            nowy+= tablicaStringow[i];
       }
		return nowy;
	}
    }
