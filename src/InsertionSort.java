import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] a = {9,2,4,10,3,18,20,1};
        insertionSort(a);
    }
    public static void insertionSort(int [] a)
    {
        for(int i = 1; i<a.length; i++)
        {
            int j = i;

            int toInsert = a[i];

            while((j>0) && (a[j-1] > toInsert))
            {
                a[j] = a[j-1];
                j--;
            }
            a[j] = toInsert;
        }
        System.out.println(Arrays.toString(a));
    }
}
