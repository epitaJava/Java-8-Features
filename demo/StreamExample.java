package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamExample {
	int id;
	String studentname;
	int age;

	public StreamExample(int id, String studentname, int age) {
		this.id = id;
		this.studentname = studentname;
		this.age = age;
	}

	public static void main(String[] args) {

		List<StreamExample> studentList = new ArrayList<StreamExample>();
		studentList.add(new StreamExample(1, "Tom", 21));
		studentList.add(new StreamExample(2, "Harry", 22));
		studentList.add(new StreamExample(5, "Sam", 23));
		studentList.add(new StreamExample(3, "Jazz", 20));
		studentList.add(new StreamExample(4, "Roy", 22));

		List<Integer> ageList = studentList.stream()
				.filter(a -> a.age < 22)
				.map(a -> a.age)
				.collect(Collectors.toList());

		studentList.stream()
			.filter(a -> a.age < 22)
			.forEach(n -> System.out.println(n.studentname));

		List<StreamExample> sortedList = studentList.stream()
											.sorted((id1,id2) -> id2.id - id1.id)
											.collect(Collectors.toList());
		
		for(StreamExample s:  sortedList)
		System.out.println(s.id +"--" +s.studentname);

		System.out.println(ageList);

	}
}
