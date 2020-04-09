
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Sortowanie
{
    public static void main(String[] args)
    {
        int []tablica = new int[200];
        Random r = new Random();
        for(int x = 1; x < tablica.length+1; x++)
        {
            int a=r.nextInt(200);
            while (tablica[a]!=0)
            {
                a = r.nextInt(200);
            }
            tablica[a] = x;
        }
        System.out.println("Utworzono tablicę z losowymi liczbami");
        for (int x = 0; x < tablica.length; x++)
            {
                System.out.println(tablica[x] + " , ");
             }
        System.out.println("Proszę wybrać metodę sortowania");
        System.out.println("1            Sortowanie Bąbelkowe ");
        System.out.println("2            Sortowanie Kubełkowe");

        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        switch (n) {

            case 1:
                System.out.println("Sortowanie Bąbelkowe");
                SortowanieBabelkowe babelkowe = new SortowanieBabelkowe();
                System.out.println(Arrays.toString(babelkowe.sort ( tablica )));
                System.out.println(babelkowe.steps());
                break;

            case 2:
                System.out.println("Sortowanie Kubełkowe");
                SortowanieKubelkowe kubelkowe = new SortowanieKubelkowe();
                System.out.println(Arrays.toString(kubelkowe.sort ( tablica )));
                System.out.println(kubelkowe.steps());
                break;

            default:

                System.out.println("Nieprawidłowy wybór");

        }
    }
}