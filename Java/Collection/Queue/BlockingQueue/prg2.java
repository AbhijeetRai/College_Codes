import java.util.concurrent.*;

/**
 * Data in PriorityBlockingQueue must be  of type comparable to avoid class cast exception
 * Briging Out of memoryError (completely filling heap)
 */

class Student implements Comparable<Student> {

        int id;
        String name;

        Student(int id,String name) {

                this.id = id;
                this.name = name;
        }

        public int compareTo(Student s) {

                return this.id - s.id;
        }
}


class Demo {

        public static void main(String[] args) {

                //unbounded
                PriorityBlockingQueue<Student> p = new PriorityBlockingQueue<Student> ();

                while(true) {

                        try {
                                Student s = new Student(1,"Abhijeet");
                                p.add(s);
                        }catch (Exception e) {

                                System.out.println("Exception has been caught\n");
                        }
                }
        }
}
