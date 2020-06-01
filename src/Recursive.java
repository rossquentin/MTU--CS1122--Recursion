public interface Recursive{

	// THIS IS THE SET OF RECURSIVE METHOD HEADERS

	/**
	 * This returns true if the string is a palindrome.
	 *
	 * Figure out the nth fib.
	 *
	 * @param str	The string to check
	 * @return true if str is a palindrome
	 */
	public boolean recursiveIsPalindrome(String str);

	/**
	 * This is going to compute the greatest common divisor of
	 * two positive numbers
	 *
	 * Base case: If arg1 == arg2, the GCD is arg1 or arg2.
	 *
	 * Recursive case:
	 * 	If arg1 > arg2, then the GCD = gcd(arg1 - arg2, arg2)
	 * 	If arg1 < arg2, then the GCD = gcd(arg1, arg2 - arg1)
	 */
	public int recursiveGreatestCommonDivisor(int arg1, int arg2);
	
	/**
	 * Fast Modular Exponentiation computes a^n mod m in a way
	 * that is faster than normal. This has computations that occur after
	 * the recursive call, unlike some of the previous examples we looked at.
	 *
	 * Base case: If n == 0, return 1
	 *            If n == 1, return a
	 *
	 * Recursive case:
	 * 	Assume that "x" = fastModExp(a, n/2, m)
	 *
	 *	   if n is even:
	 *       then fastModExp = x^2 (mod m)	
	 *		if n is odd:
	 * 		then fastModExp = (x^2 * a) (mod m)
	 *
	 * Solve this recursively. While you may use a helper method for this, you should
	 * not need one.
	 */
	public int fastModExp(int a, int n, int m);



	// THIS IS THE SET OF LOOP METHOD HEADERS
	// IN YOUR JAVADOC COMMENTS, PROVIDE A TIME COMPLEXITY
	
	/**
	 * Finds the index of the last alphabetical character (upper or lower case)
	 * that occurs in str.
	 *
	 * In str "Ab23123ZB; 32", this would return 8 since B is at index 8.
	 *
	 * Be careful of upper and lowercase characters!
	 * @param str	The string to check
	 * @return true if str is a palindrome
	 */
	public int loopLastAlphabeticalChar(String str);

	/**
	 * Print all possible combinations of 1 and 0 for a binary string of length n
	 *
	 * For instance, if n is 3, it will print:
	 * 000 001 010 011 100 101 110 111
	 *
	 * It can be in any order.
	 *
	 * @param n	The length of the binary string.
	 *
	 */
	public void loopPrintAllBinary(int n);

	/**
	 * Find log (base 10) of a number.
	 * Assume the number is guarunteed to be a power of ten.
	 *
	 * @param A number that is a power of 10
	 * @return the number of 0s that follow the 1 in the number.
	 */
	public int loopGetLogBaseTen(long n);

}

