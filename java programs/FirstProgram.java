package in.oops;

//Object Oriented Programing Structure
//OOPS is a method of implementation in which programs are organized as collection of objects, class
//and methods

public class FirstProgram {
	// collection of methods or collection of objects

	public void javaTest() {
		// Set of action to be performed

		System.out.println("JAVA  FIRST PROGRAM");
	}
	
	private void javaTest1() {
		// TODO Auto-generated method stub
		System.out.println("Second test");

	}

	public static void main(String[] args) {
		FirstProgram myobj = new FirstProgram();
		myobj.javaTest();
		myobj.javaTest1();
	}
}
