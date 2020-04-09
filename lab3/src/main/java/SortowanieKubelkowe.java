
public class SortowanieKubelkowe implements Sortable
{
    int liczbaPorownan = 0;

    @Override
    public int[] sort(int[] tab)
    {
        int[] koszyk = new int[tab.length + 1];
        for (int i = 0; i < koszyk.length; i++)
        {
            koszyk[i]=0;
        }
        for (int i = 0; i<tab.length; i++)
        {
            koszyk[tab[i]]++;
            liczbaPorownan++;
        }
        int x = 0;
        for (int i=0; i<koszyk.length; i++)
        {
            for (int j=0; j<koszyk[i]; j++)
            {
                tab[x++]=i;
            }
        }
        for (int i : tab) {
            System.out.print(i + " , ");
        }
        return tab;
    }

    @Override
    public double steps()
    {
        return liczbaPorownan;
    }
}
