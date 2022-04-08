/**
 * Making user defined class comparable using ArrayList
 * User defined classes are not comparable by default
 * We have to implement comparable interface and give boody to method compareTo
 */
import java.util.*;
class StudentAdmission implements Comparable<StudentAdmission> {

        String name;
        int arrivalTime;

        StudentAdmission(String name, int arrivalTime) {

                this.name = name;
                this.arrivalTime = arrivalTime;
        }

        public int compareTo(StudentAdmission s1) {

                return this.arrivalTime - s1.arrivalTime;
        }

        public String toString() {

                return name + " " + arrivalTime;
        }
}

class Demo {

        public static void main(String[] args) {

                ArrayList<StudentAdmission> queue = new ArrayList<StudentAdmission> ();

                queue.add(new StudentAdmission("Abhijeet",11));
                queue.add(new StudentAdmission("Sanket",10));
                queue.add(new StudentAdmission("Rahul",13));

                System.out.println("Before Sotring :" + queue);
                Collections.sort(queue);
                System.out.println("After Sorting :" + queue);
        }
}
