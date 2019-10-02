public class FactorialRecursion
{
    //n! = n*(n-1)! if n>=1, else (if n=0)
    //

    public static void main(String[] args) {
        System.out.println(fact(4));
    }

    public static int fact(int n)
    {
        if(n >= 1) return n * fact(n-1);
        else return 1;
    }

    /*
                n * fact(n-1)
    1. f(4) --> 4 * f(3) (kaller på f(3))
    2. f(3) --> 3 * f(2) (kaller på f(2))
    3. f(2) --> 2 * f(1) (kaller på f(1))
    4. f(1) --> 1 * f(0) (av definisjon over == 1)

    Nå vet vi at vi har alt for å fullføre oppgaven
    f(0) == 1
    Da starter vi på bunnen igjen for å fylle inn de ukjente f(3), f(2), f(1) osv
                                                                              n * fact(n-1)
    5. f(0) bruker vi til å finne f(1) == 1 * f(0) som altså er 1. Resultat = 1*(f0)1 = 1(f1).
    6. f(1) bruker vi til å finne f(2) == 2 * f(1) som altså er 1. Resultat = 2*(f1)1*1 = 2(f2).
    7. f(2) bruker vi til å finne f(3) == 3 * f(2) som altså er 2. Resultat = 3*(f2)2*1*1 = 6(f3).
    8. f(3) bruker vi til å finne f(4) == 4 * f(3) som altså er 6. Resultat = 4*(f3)3*2*1*1 = 24(f4).
     */
}
