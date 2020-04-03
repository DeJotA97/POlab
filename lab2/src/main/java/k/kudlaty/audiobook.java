package k.kudlaty;

public class audiobook
{
    String tutul;
    String autor;
    String wydawnictwo;
    String data;
    int cena;
    int numer;

    void WypiszAudiobook()
    {
        System.out.println("lista audiobooków:\n" + "tytul:  " + tutul );
        System.out.println( "autor:  " + autor);
        System.out.println("wydawnictwo:  " + wydawnictwo);
        System.out.println("data:  " + data);
        System.out.println("cena:  " + cena);
        System.out.println("numer:  " + numer);
    }
}

