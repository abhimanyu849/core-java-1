package com.lara;

public class M40
{
	static void test()
	{
		System.out.println("Float");
	}

	static void test(double d1)
	{
		System.out.println("double");
	}

	public static void main(String[] args)
	{
		long lon = 10;
		test();
		test(lon);
	}
}
