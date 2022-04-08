import java.util.*;

class Demo {

        public static void main(String[] args) {

                Deque<String> dq = new ArrayDeque<String> ();

                dq.add("Shashi");
                dq.add("Ashish");
                dq.add("Kanha");
                dq.add("Rahul");
                dq.add("Badhe");

                System.out.println(dq);
                System.out.println("Removed element - " + dq.removeLast());
                System.out.println(dq.element());
                System.out.println(dq.pollLast());
                System.out.println(dq.peek());
                System.out.println(dq);
        }
}
