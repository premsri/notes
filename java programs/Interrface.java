package in.oops;

public interface Interrface {
// It will support only abstract method, two interface implement at a time, overcome multiple
	void test5();
	void test6();
}
	 interface Interrrface {
		void test7();	
	}
	
	 class inter implements Interrface,Interrrface {

		@Override
		public void test7() {
System.out.println("testing1");			
		}

		@Override
		public void test5() {
System.out.println("testing2");	
		}

		@Override
		public void test6() {
System.out.println("testing3");			
		}
		
		public static void main(String[] args) {
			inter obj =new inter();
			obj.test5();
			obj.test6();
			obj.test7();
		}
		 
	 }