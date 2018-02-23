package in.oops;

import java.util.Scanner;


public class Scanuser {

public static void main(String[] args) {
			
	
	
	Scanner n =new Scanner(System.in);
	//get input from user
	 System.out.println("Enter a string :");
	 String s =n.nextLine();
	 System.out.println("entered"+ s); 
	System.out.println("Enter a integer");
	 int i = n.nextInt();
	 System.out.println("entered"+ i);
	 System.out.println("Enter a char");
	char A = n.next().charAt(0);
	 System.out.println("entered"+ A);
	
}
	
}

