package in.oops;

public class BreakContinue {
	
	public static void main(String[] args) {
		

	int i =0 ;
     while(i<=100)
     {
         System.out.println("Value of variable is: "+i);
         if (i==2)
         {
        	System.out.println("Code Breaked");
            break;
            // It exit from the current loop
         }
         i++;
     }
     System.out.println("Out of while-loop");
 
	int j=0 ;
	System.out.println("start");
	for (j=0 ; j <10 ; j++) {
		if(j==5) {
			System.out.println("Skipped 5");
			continue;
			// It will skip the particular iteration
		}
		System.out.println(j);
	}
	System.out.println("end");
}
}

