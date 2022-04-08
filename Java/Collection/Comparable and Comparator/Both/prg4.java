/**
 * Sorting user defined classes using comparator in TreeSet
 */
import java.util.*;

class CompareKar implements Comparator<Student> {

        public int compare(Student s1, Student s2) {

                return s1.name.compareTo(s2.name);
        }
}

class Student {

        String name;
        int id;

        Student(String name, int id) {

                this.name = name;
                this.id = id;
        }

        public String toString() {

                return name + " " + id;
        }
}

class Demo {

        public static void main(String[] args) {

                TreeSet<Student> java8 = new TreeSet<Student> (new CompareKar());

                java8.add(new Student("Abhijeet",392));
                java8.add(new Student("Sanket",303));
                java8.add(new Student("Mayur",335));
                java8.add(new Student("Rahul",404));

                System.out.println(java8);
        }
}
