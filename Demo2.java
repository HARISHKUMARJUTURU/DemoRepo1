package com.cg2;
public class Demo2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		String c=null;
		try
		{
			int b=5/2;
			System.out.println(b);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception is handled" +e);
		}

		try
		{
			int b=a[4];
			System.out.println(b);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds exception is handled" +e);
		}
		try
		{
			System.out.println(c.length());
		}

		catch (Exception e) {
			System.out.println("Remaining exceptions are caught "  +e);
		}

		finally {
			System.out.println("Executes irrespective of errors");
		}
	}
}
