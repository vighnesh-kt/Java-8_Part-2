package Collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
	
	public static void main(String[] args) {
		
		Path p=Paths.get("/Users/BaBa/workspace-spring-tool-suite-4-4.26.0.RELEASE/Java_8_Part_2/src/Collectors/EmployeeData.txt");
//		System.out.println(p.getFileName());
		
//		String s="aabbcc hbvkhv lskd";
		
		
		//to read data 
		try (Stream<String> lines = Files.lines(p)){
			
			//getting only first
//			Optional<Stream<String>> streamOfStreams=lines.map(s->Arrays.stream(s.split(","))).findFirst();
//			streamOfStreams.ifPresent(innerStream->innerStream.forEach(s->System.out.println(s)));
			
			
			//getting first 3
//			Stream<Stream<String>> limit = lines.map(s->Arrays.stream(s.split(","))).limit(3);
//			limit.forEach(s->System.out.println(s));
			
			
			//getting only third 
//			Optional<Stream<String>> limit = lines.map(s->Arrays.stream(s.split(","))).skip(2).findFirst();
//			limit.ifPresent(inner->inner.forEach(s->System.out.println(s)));
			
			//we cant get last-3 or 4 as it stream perform first to last to do this we need to store whole into a list
//			and use index to get that
			
			
//			Stream<Stream<String>> linelulu=lines.map(s->Arrays.stream(s.split(",")));
			Stream<String> words = lines.flatMap(s->Arrays.stream(s.split(",")));
			Spliterator<String> baseSpliterator = words.spliterator();
			Spliterator<Employee> emp=new EmployeeSpliterator(baseSpliterator);
			
			Stream<Employee> stream = StreamSupport.stream(emp, false);
//			stream.forEach(employee->System.out.println(employee.toString()));
//			When using Files.lines(p), you will always get N number of streams, where N is the number of lines in the file.
//			s.split(",") returns a String[] (array).
//			Arrays.stream(s.split(",")) converts that String[] into a Stream<String>, which is required by flatMap().
			

//			Task 1
//			List of all employee names
			
//			List<String> collect = stream.map(s->s.getName()).collect(Collectors.toList());
//			collect.forEach(ename->System.out.println(ename));
			
			
//						Task 2
//			as we used the stream we cannot use this stream again as it will be closed
			//saving emp into list and getiing unique designation
			List<Employee> employees = stream.collect(Collectors.toList());
			
//			Set<String> designation = employees.stream().map(s->s.getDesignation()).collect(Collectors.toUnmodifiableSet());
//			designation.forEach(s->System.out.println(s));
//			designation.add("Kela");
//			designation.forEach(s->System.out.println(s));
			
			
//						Task 3
//			Sorting by employee Id using treeset
//			but to do this we need to implement compareTo in the class
			
//			TreeSet<Employee> collect = employees.stream().collect(Collectors.toCollection(()->new TreeSet<>()));
//			collect.forEach(s->System.out.println(s));
			
//						Task 4 
//			save id as key and name as values
			
//			Map<Integer, String> collect = employees.stream().collect(Collectors.toMap(s->s.getId(), s->s.getName()));
//			collect.forEach((s, t) -> System.out.println(s + " -> " + t));
//			System.out.println(collect);
			
			
//						Task 5 Partition the data
//			All male and female employees in a different collection
			
			//if we want either male or female we can use filter
//			List<Employee> collect = employees.stream().filter(emplo->emplo.getGender()=='M').collect(Collectors.toList());
//
//			System.out.println(collect);
			
//			Map<Boolean, List<Employee>> collect = employees.stream().collect(Collectors.partitioningBy(e->e.getGender()=='M'));
//			
//			collect.entrySet().stream().filter(s->s.getKey().equals(false)).forEach((s)->System.out.println(s));
//			//map for each takes 2 argument but in this
////			After filtering, only one entry (key-value pair) remains, which is why forEach() gets only one argument (entry) instead of two.
//
//			//getting both in seperate collection
//			List<Employee> male = collect.get(true);
//			List<Employee> female = collect.get(false);
			
			
//			Task 6 group the designation
//			Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(group->group.getDesignation()));
//			System.out.println(collect);
//			
//			collect.entrySet().stream().filter(lead->lead.getKey().equals("Architect")).forEach(s->System.out.println(s));
//			
			
//			Task 7 returning no colletion but small data structure
			
//			String collect = employees.stream().map(empl->empl.getName()).collect(Collectors.joining(", ","[}","]"));
//			
//			System.out.println(collect);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
