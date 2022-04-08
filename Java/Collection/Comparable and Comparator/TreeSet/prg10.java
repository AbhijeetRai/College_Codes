import java.util.*;

class Employee implements Comparator<Employee> {

        int id;
//as we have removed the default constructor, we have added a parameter in
// Employee object while making object of treeSet

        Employee(int id) {

                this.id = id;
        }

        public int compare(Employee e1, Employee e2) {

                return e1.id - e2.id;
        }

        public String toString() {

                return Integer.toString(id);
        }
}

class Demo {

        public static void main(String[] args) {

                TreeSet s = new TreeSet(new Employee(5));
                s.add(new Employee(1));
                s.add(new Employee(2));
                s.add(new Employee(3));
                s.add(new Employee(1));

                System.out.println(s);
        }
}
