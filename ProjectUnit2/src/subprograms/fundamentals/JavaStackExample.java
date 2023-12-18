package subprograms.fundamentals;
public class JavaStackExample {
	
	
	static int twoFold(int num) {
		int result= num*2;
		
		num=num+2;
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int res= twoFold(x);
		
		System.out.println(res);
		
		System.out.println(" the change in the parameter num does not affect the variable x:" + x);

	}

}
