public class FibonacciRecursion
{


    public static void main(String[] args)
    {
        System.out.println(fib(4));
    }
    //Fibonacci tallene får man ved å legge sammen de to tallene før i rekken.
    //1,1,2,3,5,8
    //n representerer nth number i tallrekken
    //n(4) skal gi 3
    // f(n) = f(n-1) + f(n-2)
    // feks f(5) = f(4) + f(3)
    //Finne f4. --> Først fylle fibotallene fra bunnen av

    public static int fib(int n)
    {
        if(n>=3)
        {
            return fib(n-1) + fib(n-2);
        }
        else return 1; //I recursion når det er et argument som
        // ikke kaller på seg selv kalles det base case
    }

    /*
    f(n) = f(n-1) + f(n-2)

    1. f(4) = f(3) + f(2) kaller på f(3) først
    2. f(3) = f(2) + f(1) f(3) kaller på f(2) og f(1)
    3. Da har vi verdien til f(3) == 2 på 1. punkt.
    Deretter kalles f(2) som ikke oppfyller (n>=3) derfor returneres 1.
    Da har vi hele stykket:
    Fibo:1,1,2,3,5,8
    f(n):1,2,3,4,5,6
    f(4) = f(3) + f(2)

    f(3) = 2
    f(2) = 1
    f(4) = 3

    f(2) returnerer 1
    f(1) returner 1
     */
}
