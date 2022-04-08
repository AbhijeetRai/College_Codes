import java.util.*;

class Employee {

        String name;
        int id;

        Employee(String name,int id) {

                this.name = name;
                this.id = id;
        }
}

class Demo {

        public static void main(String[] args) {

                Hashtable table = new Hashtable();
                table.put(new Employee("Shahsi",100),"Bi");
                table.put(new Employee("Sanket",20),"Apple");

                System.out.println(table);
        }
}
