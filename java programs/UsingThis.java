package in.oops;

public class UsingThis {

		public UsingThis() {
			this(10);
			System.out.println("construct");
		}

		public UsingThis(int i) {
			System.out.println("arg int");
		}

		public static void main(String[] args) {
			UsingThis myobj =new UsingThis();
			
		}
}
