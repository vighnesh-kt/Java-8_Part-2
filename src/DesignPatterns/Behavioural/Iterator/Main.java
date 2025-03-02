package DesignPatterns.Behavioural.Iterator;

public class Main {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Jhinga";
		s.id=1;
		Student s2=new Student();
		s2.name="Linga";
		s2.id=2;
		
		
		Management<Student> studentManagement=new Management<>();
		studentManagement.add(s);
		studentManagement.add(s2);
		
		MyIterator<Student> studentIterator=studentManagement.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
		
	}

}
