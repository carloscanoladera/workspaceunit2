package subprograms.fundamentals;

public class JavaVariableScopeExample {
	
	static int global=5;
	
	public static int functionTest(int num) {
		int num2;
		
		num2= 7;
		global++;
		
		return num+ num2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;

		
		
		
		x=4;
		global=x;
		y=functionTest(x);
		
		if (x>0){
			int z;
			
		}
		
		z=2;
				
						

	}

}
