package Collectors.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Comparable: Default sorting by ID (Ascending Order)
    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList();
        employees.add(new Employee(105, "Mike"));
        employees.add(new Employee(102, "Alice"));
        employees.add(new Employee(104, "David"));
        employees.add(new Employee(101, "John"));

        // 🔹 Default sorting (uses Comparable's compareTo method)
        Collections.sort(employees);
        System.out.println("Sorted by ID (Ascending - Comparable):");
        employees.forEach(System.out::println);
        
//        🔹 How Sorting Works Internally
//        Java follows these steps using the TimSort algorithm:
//
//        Step 1: Compare 105 vs 102
//        compareTo() returns 1 (105 > 102) → Swap
//        Now: [102, 105, 104, 101]
//        Step 2: Compare 105 vs 104
//        compareTo() returns 1 (105 > 104) → Swap
//        Now: [102, 104, 105, 101]
//        Step 3: Compare 104 vs 101
//        compareTo() returns 1 (104 > 101) → Swap
//        Now: [102, 101, 104, 105]
//        Step 4: Compare 102 vs 101
//        compareTo() returns 1 (102 > 101) → Swap
//        Now: [101, 102, 104, 105]
//        Sorting is complete! 🎉

        // 🔹 Sorting using Comparator (sort by name instead)
        employees.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("\nSorted by Name (Comparator):");
        employees.forEach(System.out::println);
    }
}
