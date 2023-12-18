package subprograms;

public class Procedimientos {
	
	
	public static void nameProc () {
		
		System.out.println("Procedure parameterless");
		
	}
	
	public static void nameProcParametros (int param1, String param2) {
		
		System.out.println("Procedure with formal param1"  + param1 + " y param2 " + param2);
		
	}
	
	
	public static void main(String[] args) {
		
		nameProc();
		nameProcParametros(2, "Hello");
		
		
	}
	

}
