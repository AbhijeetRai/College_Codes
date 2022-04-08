import java.util.*;

class Employee {

        String name;

        Employee(String name) {

                this.name = name;
        }

        public String toString() {

                return name;
        }
}

class Demo {

        public static void main(String[] args) {

                HashMap<String, Employee> list = new HashMap<String, Employee> ();

                list.put("Apple",new Employee("Raju"));
                list.put("Google",new Employee("Sanket"));
                System.out.println(list);

        }
}
