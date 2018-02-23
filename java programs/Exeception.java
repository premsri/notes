package in.oops;

import java.io.IOException;

public class Exeception {
	//Exception is like a error, the program will terminated that line itself
	public static void info() throws Throwable {
		try {
			System.out.println("hello");
			throw new IOException();
			//Throw is a keyword, we can through any exception inside the method
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Throwable {
		//Throws is a keyword, it is used to declare the exception(in method level)
		info();
		//If we get exception, try will throw the exception and catch will catch the exception
		try {
			System.out.println(12);
			System.out.println("12");
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("good");
		}
		//finally will execute always whether the exception through or not
		System.out.println(11);
		int num[] = new int[3];
		System.out.println(num[4]);

	}

}
