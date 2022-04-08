import java.util.*;

class Employee {

        Employee(int a ) {

        }
}

class Demo {

        public static void main(String[] args) {

                LinkedHashSet h = new LinkedHashSet();
                h.add(new Employee(1));
                h.add(new Employee(1));
                h.add(new Employee(2));

                /** 3 Employees are added as content inside user defined class is not checked*/
                System.out.println(h);
        }
}
