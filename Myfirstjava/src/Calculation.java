
 class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z= x+y;
		System.out.println("the addition:"+z);
	}
	public void subtraction(int x,int y) {
		z= x-y;
		System.out.println("the subtraction:"+z);
	
		}

	public static void main(String args[]) {
		
	Calculation Cal  = new Calculation();
	Cal.addition(10, 20);
	Cal.subtraction(20, 30);
	My_calculation Cal1= new My_calculation();
	Cal1.multiplication(10,30 );
	}
 
}


	
