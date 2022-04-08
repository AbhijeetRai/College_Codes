import java.util.*;

class Student implements Comparable<Student> {

        String name;

        Student(String name) {

                this.name = name;
        }

        public int compareTo(Student s1) {

                return this.name.compareTo(s1.name);
        }

        public String toString() {

                return name;
        }
}

class Demo {

        public static void main(String[] args) {

                TreeMap<Student,Integer> list = new TreeMap<Student,Integer> ();
                list.put(new Student("Zagade"),83);
                list.put(new Student("Divya"),16);
                list.put(new Student("Sujay"),69);
                list.put(new Student("Abhijeet"),30);

                System.out.println(list);
        }
}
