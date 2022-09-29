package Java_Collections_Assignment;

import java.util.HashMap;
import java.util.Map;

class Employees {
    String Name;
    int Age;
    String Designation;
    int Salary;

    Employees(String name, int age, String designation, int salary) {
        this.Name = name;
        this.Age = age;
        this.Designation = designation;
        this.Salary = salary;
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Employees e1 = new Employees("Puneet ", 22, "SE", 1000);
        Employees e2 = new Employees("Sonalika", 23, "QE", 10000);
        Employees e3 = new Employees("Ritik", 24, "QE", 10000);
        Map<Employees, Integer> map = new HashMap<>();
        map.put(e1, e1.Salary);
        map.put(e2, e2.Salary);
        map.put(e3, e3.Salary);

        for (Map.Entry<Employees, Integer> m : map.entrySet()) {
            Employees e = m.getKey();
            System.out.println(m.getKey() + " " + e.Age + " " + e.Name + " " + e.Designation + " : " + m.getValue());
        }


    }
}