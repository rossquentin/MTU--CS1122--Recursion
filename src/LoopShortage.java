public class LoopShortage implements Recursive{

    /**
     * This returns true if the string is a palindrome.
     *
     * @param str	The string to check
     * @return true if str is a palindrome
     */
    public boolean recursiveIsPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return recursiveIsPalindrome(str.substring(1, str.length() - 1));
    }

    /**
     * This is going to compute the greatest common divisor of
     * two positive numbers
     *
     * @param arg1  First number
     * @param arg2  Second number
     * @return  the greatest common divisor between arg1 and arg2
     */
    public int recursiveGreatestCommonDivisor(int arg1, int arg2) {
        if (arg1 == arg2) {
            return arg1;
        }
        else if (arg1 > arg2) {
            return recursiveGreatestCommonDivisor(arg1 - arg2, arg2);
        }
        else {
            return recursiveGreatestCommonDivisor(arg1, arg2 - arg1);
        }
    }

    /**
     * Fast Modular Exponentiation computes a^n mod m in a way
     * that is faster than normal. This has computations that occur after
     * the recursive call, unlike some of the previous examples we looked at.
     *
     * @param a Base of the exponent
     * @param n Power of the exponent
     * @param m Modulo to use against a^n
     * @return  result of a^n mod m
     */
    public int fastModExp(int a, int n, int m) {
        if (n == 0)
        {
            return 1;
        }
        else if (n == 1)
        {
            return a;
        }
        else {
            int x = fastModExp(a, n/2,m);
            if (n%2 == 0) {
                return (x*x) % m;
            }
            else {
                return (x*x*a) % m;
            }
        }
    }

    /**
     * Finds the index of the last alphabetical character (upper or lower case)
     * that occurs in str.
     *
     * In str "Ab23123ZB; 32", this would return 8 since B is at index 8.
     *
     * Time Complexity: O(n)
     *
     * @param str	The string to check
     * @return      the index of the last alphabetical character in str. Returns -1 if there is no alphabetical character a-z in the string.
     */
    public int loopLastAlphabeticalChar(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.toLowerCase().charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    return i;
                default:
                    break;
            }
        }
        return -1;
    }

    public void loopPrintAllBinary(int n) {

    }

    /**
     * Finds log(n)/log(10)
     * Assume the number is guaranteed to be a power of ten.
     *
     * Time Complexity: O(log(n))
     *
     * @param n Number that is a power of 10
     * @return  the result of log(n)/log(10)
     */
    public int loopGetLogBaseTen(long n) {
        int result = 0;
        for (long i = n; i >= 10; i /= 10) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        LoopShortage loop = new LoopShortage();
        String lastAlph = "Ab23123Z41; 3av2";
        int GCDArg1 = 125;
        int GCDArg2 = 20;
        int fastModExpA = 11;
        int fastModExpN = 3;
        int fastModExpM = 12;
        long logTenNum = 1000000000000L;
        String palStr = "acabbaca";

        System.out.printf("Last Alphabet Character Test [%s]: %s%n", lastAlph, loop.loopLastAlphabeticalChar(lastAlph));
        System.out.printf("Greatest Common Denominator Test [%s, %s]: %s%n", GCDArg1, GCDArg2,loop.recursiveGreatestCommonDivisor(GCDArg1, GCDArg2));
        System.out.printf("Fast Modular Exponentiation Test [a: %s, n: %s, m: %s]: %s%n", fastModExpA, fastModExpN, fastModExpM ,loop.fastModExp(fastModExpA,fastModExpN,fastModExpM));
        System.out.printf("Log Base Ten Test [%s]: %s%n", logTenNum, loop.loopGetLogBaseTen(logTenNum));
        //System.out.print("All Binary Test: ");
        //loop.loopPrintAllBinary(3);
        System.out.printf("Palindromic String Test [%s]: %s%n", palStr, loop.recursiveIsPalindrome(palStr));
    }
}
