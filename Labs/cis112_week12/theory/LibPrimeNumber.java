package cis112_week12.theory;

/**
 * useful functions for prime numbers
 * 
 * @author bingol
 */
public class LibPrimeNumber {

	public static int nextPrime(int n) {
		if (n <= 1) {
			return 2;
		}
		int prime = n;
		boolean found = false;
		while (!found) {
			prime++;
			if (isPrime(prime)) {
				found = true;
			}
		}
		return prime;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}
