package demo;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {
		// Lambda without return
		Addition addition = (a, b) -> (a + b);
		System.out.println(addition.add(100, 200));

		// Lambda with return statement
		Addition addition2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(addition2.add(200, 200));

		// List using lambda expression
		List<String> names = new ArrayList<String>();
		names.add("abcd");
		names.add("efgh");
		names.add("ijkl");

		names.forEach((n) -> System.out.println(n));

	}
}

@FunctionalInterface //Optional
interface Addition {
	int add(int a, int b);
}
