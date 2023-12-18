package subprograms.fundamentals;
public class Procedures {
	
	
	public static void nameProc () {
		
		System.out.println("Procedure parameterless");
		
	}
	
	public static void nameProcParam (int param1, String param2) {
		
		System.out.println("Procedure with formal param1"  + param1 + " y param2 " + param2);
		
	}
	
	
	public static void main(String[] args) {
		
		nameProc();
		nameProcParam (2, "Hello");
		
		
	}
	

}
