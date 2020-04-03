package k.kudlaty;
import java.util.Scanner;

public class start {
    public static void main (String[] args)
    {
    Ksiazki AssassinsCreed = new Ksiazki();
        AssassinsCreed.tutul = "AssassinsCreed";
        AssassinsCreed.autor = "Oliver Bowden";
        AssassinsCreed.data = "13,06,2008";
        AssassinsCreed.wydawnictwo = "insignis";
        AssassinsCreed.cena = 59;
        AssassinsCreed.numer = 1;

        plyty Slipknot = new plyty();
        Slipknot.tutul = "Slipknot";
        Slipknot.autor = "Slipknot";
        Slipknot.data = "13,07,2009";
        Slipknot.wydawnictwo = "jaś i staś";
        Slipknot.cena = 49;
        Slipknot.numer = 1;

        filmy Terminator = new filmy();
        Terminator.tutul = "Terminator";
        Terminator.autor = "James Cameron";
        Terminator.data = "12,05,2010";
        Terminator.wydawnictwo = "roomba zoomba";
        Terminator.cena = 80;
        Terminator.numer = 1;

        audiobook HarryPotter = new audiobook();
        HarryPotter.tutul = "HarryPotter";
        HarryPotter.autor = "J.K.Rowling";
        HarryPotter.data = "25,07,2010";
        HarryPotter.wydawnictwo = "insignis";
        HarryPotter.cena = 25;
        HarryPotter.numer = 1;

        ebook DOOM = new ebook();
        DOOM.tutul = "DOOM";
        DOOM.autor = "id Software";
        DOOM.data = "25,07,2010";
        DOOM.wydawnictwo = "Bethesda";
        DOOM.cena = 20;
        DOOM.numer = 1;

        System.out.println("Co wypożyczyć? \n Wybierz numer:\n Ksiazki - 1 \n plyty - 2 \n filmy - 3 \n audiobook - 4 \n ebook - 5");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a == 1 )
        {
            AssassinsCreed.WypiszKsiazki();

            System.out.println("Jaka ksiazka? wpisz numer ksiazki");
            int b = scan.nextInt();
            if (b == 1)
            {
                System.out.println("wypozyczono AssassinsCreed");
                System.out.println("czas: 60 dni od dnia wypożyczenia");
                System.out.println("kara za nieprzestrzeganie terminu: 30gr/dzien");
            }
        }

        if ( a == 2)
        {
            Slipknot.WypiszPlyty();

            System.out.println("Jaka plyta? wpisz numer plyty");
            int b = scan.nextInt();
            if (b == 1)
            {
                System.out.println("wypozyczono Slipknot");
                System.out.println("czas: 60 dni od dnia wypożyczenia");
                System.out.println("kara za nieprzestrzeganie terminu: 30gr/dzien");
            }
        }

        if ( a == 3)
        {
            Terminator.WypiszFilmy();

            System.out.println("Jaki Film? wpisz numer filmu");
            int b = scan.nextInt();
            if (b == 1)
            {
                System.out.println("wypozyczono Terminator");
                System.out.println("czas: 60 dni od dnia wypożyczenia");
                System.out.println("kara za nieprzestrzeganie terminu: 30gr/dzien");
            }
        }

        if ( a == 4)
        {
            HarryPotter.WypiszAudiobook();

            System.out.println("Jaki audiobook? wpisz numer audiobooka");
            int b = scan.nextInt();
            if (b == 1)
            {
                System.out.println("wypozyczono HarryPotter");
                System.out.println("czas: 60 dni od dnia wypożyczenia");
                System.out.println("kara za nieprzestrzeganie terminu: 30gr/dzien");
            }
        }

        if ( a == 5)
        {
            DOOM.WypiszEbook();

            System.out.println("Jaki ebook? wpisz numer ebooka");
            int b = scan.nextInt();
            if (b == 1)
            {
                System.out.println("wypozyczono DOOM");
                System.out.println("czas: 60 dni od dnia wypożyczenia");
                System.out.println("kara za nieprzestrzeganie terminu: 30gr/dzien");
            }
        }

    }
}
