public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] a = {9,2,4,10,3,18,20,1};
        BubbleSort.bubbleSort(a);
        binarySearchForValue(10, a);
    }

    public static void binarySearchForValue(int value, int[] a)
    {
        int lowIndex = 0;
        int highIndex = a.length-1;

        while(lowIndex <= highIndex)
        {
            int middleIndex = (highIndex+lowIndex)/2;

            if(a[middleIndex] < value) lowIndex = middleIndex+1;
            else if(a[middleIndex] > value)highIndex = middleIndex-1;
            else
            {
                System.out.println("Found a match for value at " +middleIndex+" index");
                lowIndex = highIndex+1;
            }
        }
    }
}
