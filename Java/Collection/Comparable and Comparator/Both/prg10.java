/**
 * Sorting user defined class in arraylist using Comparator - anonymous
 */
import java.util.*;

class Java8 {

        String name;
        int id;

        Java8(String name, int id) {

                this.name = name;
                this.id = id;
        }

        public String toString() {

                return name + "  " + id;
        }
}

class Demo {

        public static void main(String[] args) {

                ArrayList<Java8> students = new ArrayList<Java8> ();

                students.add(new Java8("Mayur",12));
                students.add(new Java8("Sanket",11));
                students.add(new Java8("Abhijeet",13));

                System.out.println("Before Sorting ::: " + students);

                Comparator<Java8> sortname = new Comparator<Java8> () {

                        public int compare(Java8 j1, Java8 j2) {

                                return j1.name.compareTo(j2.name);
                        }
                };

                Collections.sort(students, sortname);
                System.out.println("After Sorting : " + students);
        }
}
