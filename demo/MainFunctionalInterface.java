package demo;

public class MainFunctionalInterface {

	public static void main(String[] args) {
		// Syntax- ClassName objectname = () -> {...};

		FunctionalInterfaceExample fin = (name, value) -> {

			System.out.println("Hello lambda expression!\n" + name +" "+value);
		};
		fin.test("Abcd", 0);
	}

}
