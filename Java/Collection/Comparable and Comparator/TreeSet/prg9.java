import java.util.*;

class Employee implements Comparator<Employee> {

        int id;

        /**
         * We will have to add this defualt constructor to satify call of new Employee in making
         * Object of treeSet
         */
        Employee() {

        }

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

                TreeSet s = new TreeSet(new Employee());
                s.add(new Employee(1));
                s.add(new Employee(2));
                s.add(new Employee(3));
                s.add(new Employee(1));

                System.out.println(s);
        }
}
