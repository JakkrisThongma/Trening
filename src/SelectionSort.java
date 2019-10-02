import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] a = {9,2,4,10,3,18,20,1};
        selectionSort(a);
    }
    public static void selectionSort(int[] a)
    {
        for(int x = 0; x <a.length; x++)
        {
            int min = x;

            for(int y = x+1; y<a.length; y++)
            {
                if(a[min] > a[y])
                {
                    min = y;
                }
            }
            swapValues(x,min,a);
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swapValues(int indexOne, int indexTwo, int [] a)
    {
        int temp = a[indexOne];
        a[indexOne] = a[indexTwo];
        a[indexTwo] = temp;
    }
}
