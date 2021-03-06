package algorithms;

/**
 * A class that implements some basic mathematical functions using recursion.
 * 
 * YOU MUST USE RECURSION, NOT ITERATION, TO IMPLEMENT THESE FUNCTIONS!
 *
 * @author jcollard
 */
public class RecursiveMath {

	/**
	 * Returns {@code true} if {@code val} is even and {@code false} otherwise.
	 *
	 * @param val
	 * @return {@code true} if {@code val} is even and {@code false} otherwise.
	 */
	public boolean isEven(int val) {
		// Without recursion this could be: return val % 2 == 0;
//final int a=1;
		if(val==0)
			return true;
		else if(val==1||val==-1)
		return false;
		
		if(val>0)
		return isEven(val-2);
		else if(val<0)
		return isEven(val+2);
		
		return false;
	}
	/**
	 * Returns {@code true} if {@code val} is odd and {@code false} otherwise.
	 * 
	 * @param val
	 * @return {@code true} if {@code val} is odd and {@code false} otherwise.
	 */
	public boolean isOdd(int val) {
		// Without recursion this could be: return val % 2 == 1;

		if(val==0)
			return false;
		else if(val==1||val==-1)
		return true;
		
		if(val>0)
		return isOdd(val-2);
		else if(val<0)
		return isOdd(val+2);
		
		return false;
	}

	/**
	 * Returns the sum of all values between 0 and n.
	 * 
	 * @param n
	 * @return the sum of all values between 0 and n.
	 * @throws IllegalArgumentException
	 *             if n is less than 0.
	 */
	public int sumN(int n) {
	//	int a=n-1;
		//int sum=n+a;
		//int sum=0;
		if(n<0)
			throw new IllegalArgumentException();
		if(n==0)
			return 0;
		else //if(n>0)
			return ((n)+sumN(n-1));
	
		//return -1;
		
	}

	/**
	 * Returns the multiplication of all values between 1 and n.
	 * 
	 * @param n
	 * @return the multiplication of all values between 1 and n.
	 * @throws IllegalArgumentException
	 *             if n is less than 0.
	 */
	public int factorial(int n) {
	if(n<0)
		throw new IllegalArgumentException();
	if(n==0)
		return 1;
	else
		return n*factorial(n-1);
		//return -1;
	}

	/**
	 * Returns 2 to the nth power. (2^n)
	 * 
	 * @param n
	 * @return 2 to the nth power.
	 * @throws IllegalArgumentException
	 *             if n is less than 0.
	 */
	public int biPower(int n) {
	
		if(n<0)
			throw new IllegalArgumentException();		
		if(n==0)
			return 1;
		else 
			return (2*biPower(n-1));
		//a*=2;
		//biPower(n-1);
		//if(n==1)
		//return a;
		//else if(n==0)
		//return 2*(biPower(n-1)*2);
		//return -1;
	}
}

