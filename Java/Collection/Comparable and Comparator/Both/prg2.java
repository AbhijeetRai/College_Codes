/**
 * making user defined class comparable in TreeSet
 */

import java.util.*;

class Student implements Comparable<Student> {

        String name;
        int id;

        Student(String name, int id) {

                this.name = name;
                this.id = id;
        }

        public int compareTo(Student s1) {

                return this.name.compareTo(s1.name);
        }

        public String toString() {

                return name + " " + id;
        }
}

class Demo {

        public static void main(String[] args) {

                TreeSet<Student> students = new TreeSet<Student> ();

                students.add(new Student("Abhijeet",392));
                students.add(new Student("Sanket",303));
                students.add(new Student("Mayur",335));
                students.add(new Student("Rahul",404));

                System.out.println(students);
        }
}
