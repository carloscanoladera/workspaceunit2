package recursividad;
public class MecanismoEjecucionStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first_func();
	}

	public static void first_func() {
		int x=1;
		second_func();
	}

	public static void second_func() {
		int i=0;
		System.out.println("Hello World");
	}

}
