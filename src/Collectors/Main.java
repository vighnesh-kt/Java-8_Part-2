package Collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		Path p=Paths.get("/Users/BaBa/workspace-spring-tool-suite-4-4.26.0.RELEASE/Java_8_Part_2/src/Collectors/EmployeeData.txt");
		System.out.println(p.getFileName());
		
//		String s="aabbcc hbvkhv lskd";
		
		
		//to read data 
		try (Stream<String> lines = Files.lines(p)){
			lines.flatMap(s->Arrays.stream(s.split("\n"))).forEach(s->System.out.println(s));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
