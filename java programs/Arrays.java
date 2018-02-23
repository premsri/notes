package in.oops;

import java.util.ArrayList;

/*collection of similar data type, based on index
store multiple value in single variable
index starts from 0 to n-1 */

public class Arrays {
	
	public static void main(String[] args) {
		int num[] =new int[3];
		//if we dont assign any value it will take default value
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[1] = 35;
		//If we overwrite the value, it takes last one
		System.out.println(num[1]);
		int length = num.length;
		System.out.println(length);
		for (int i : num) {
			System.out.println(i);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		} 
		int i = num.length;
		System.out.println(i);
	}

	
}
