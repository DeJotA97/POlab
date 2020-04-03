package k.kudlaty;

public class Ksiazki
{
    String tutul;
    String autor;
    String wydawnictwo;
    String data;
    int cena;
    int numer;

    void WypiszKsiazki()
    {
        System.out.println("lista ksiazek:\n" + "tytul:  " + tutul );
        System.out.println( "autor:  " + autor);
        System.out.println("wydawnictwo:  " + wydawnictwo);
        System.out.println("data:  " + data);
        System.out.println("cena:  " + cena);
        System.out.println("numer:  " + numer);
    }
}
