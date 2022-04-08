//key must be comparable

import java.util.*;

class Student {

        String name;

        Student(String name) {

                this.name = name;
        }
}

class Demo {

        public static void main(String[] args) {

                TreeMap<Student,Integer> list = new TreeMap<Student,Integer> ();
                list.put(new Student("Zagade"),83);
        }
}
