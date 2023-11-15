package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("abcd");
    names.add("ijkl");
		names.add("efgh");
		
		
		List<String> filteredNames = names.stream()
									.filter(n -> n.startsWith("i"))
									.collect(Collectors.toList());
		List<String> sortedList = names.stream()
				.sorted()
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);

		System.out.println(filteredNames);
	}

}
