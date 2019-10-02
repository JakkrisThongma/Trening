public class BigONotation
{
    public static void main(String[] args)
    {
        int [] a = {4,5,3,6,7}; // n = 5
        int [] b = {5,8,4,2,6,7,9,2,5,10}; // n = 10
        System.out.println(sumArray(a));
    }

    public static int sumArray(int[] a)
    {
        int sum = 0;
        for(int i = 0; i<=a.length-1; i++)
        {
            sum += a[i];
        }
        return sum;
    }

    /*
    Denne metodens tidsforbruk øker lineært
    time complexity = linear time.
    "time complexity = a way of showing how the runtime of
    a function increases as the size of the input increases."
    Vi har også constant time og quadratic time.

    Linear time = O(n)
    Constant time = O(1)
    Quadratic time = O(n^2)

    I dette tilfellet:
    T = time to run the function
    N = Size of input/number of elements
    A & B = constants
    T = an + b

    1. For å identifisere hva slags O notation det er må man finne
    "fastest growing term"
    Her har vi:
    (an) + (b) --> b øker ikke i det hele tatt uansett hvor mye elementer det er (n)

    2. Ta ut koeffisienten --> a = konstant, n er ikke det. Derfor fjerner vi a, og da har vi bare n.

    Eksepel 2:
    C & D & E = constants
    T = cn^2 + dn + e
    1. Find the fastest growing term
    (cn^2) - (dn) - e
    Her ser vi at cn^2 vil bli mye større enn dn.

    cn^2 == fastest growing term

    2. Take out the the coefficient
    cn^2 --> n^2 --> T = O(n^2)
    */
}
