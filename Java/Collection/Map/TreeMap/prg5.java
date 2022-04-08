import java.util.*;

class CompareName implements Comparator<Student> {

        public int compare(Student s1, Student s2) {

                return s1.id - s2.id;
        }
}

class Student {

        int id;
        String name;

        Student(int id, String name) {

                this.id = id;
                this.name = name;
        }

        public String toString() {

                return id + "  " + name; 
        }
}

class Demo {

        public static void main(String[] args) {

                TreeMap m = new TreeMap(new CompareName()) ;

                m.put(new Student(83,"Zagade"),"Nanded City");
                m.put(new Student(16,"Divya"),"SITS girls hostel");
                m.put(new Student(69,"Sujay"),"SITS Boys Hostel");
                m.put(new Student(30,"Abhijeet"),"Narhe");

                System.out.println(m);
        }
}
