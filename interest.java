// Java program to find compound interest for
// given values.
import java.io.*;

class interest
{
	public static void main(String args[])
	{
		double principle = 10000, rate = 5, time = 2;

		/* Calculate compound interest */
		double A = principle *
					(Math.pow((1 + rate / 100), time));
		double CI = A - principle;
		
		System.out.println("Compound Interest is "+ CI);
	}
}

