import java.util.Scanner;
import java.util.stream.Stream;

class TestClass {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int[] ints = Stream.of(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstNum = ints[0];
        int secondNum = ints[1];
        int output = commonFactors(firstNum,secondNum);
        System.out.println(output);
    }

    private static int commonFactors(int a  , int b) {
        int n = gcd(a, b);

        int result = 0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                if (n/i == i)
                    result += 1;
                else
                    result += 2;
            }
        }
        return result;
    }

    private static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b%a,a);
    }
}