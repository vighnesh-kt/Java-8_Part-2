package Collectors;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		Path p=Paths.get("/Users/BaBa/workspace-spring-tool-suite-4-4.26.0.RELEASE/Java_8_Part_2/src/Collectors/EmployeeData.txt");
		System.out.println(p.getFileName());
		
	}

}
