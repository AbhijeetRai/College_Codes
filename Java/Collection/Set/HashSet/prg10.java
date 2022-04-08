import java.util.*;

class Employee {

        int a;

        Employee(int a ) {

           this.a = a;
        }

        /*public String toString() {

                return Integer.toString(a);
        }*/
}

class Demo {

        public static void main(String[] args) {

                HashSet h = new HashSet();
                h.add(new Employee(1));
                h.add(new Employee(1));
                h.add(new Employee(1));

                /** 3 Employees are added as content inside user defined class is not checked*/
                System.out.println(h);
        }
}
