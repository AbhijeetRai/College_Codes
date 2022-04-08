import java.util.concurrent.*;

class Demo {

        public static void main(String[] args) throws Exception {

                PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<Integer> (1);
                pq.add(1);
                pq.add(2);
                System.out.println("PQ is " + pq);


                LinkedBlockingQueue<Integer> lq = new LinkedBlockingQueue<Integer> (1);
                lq.add(1);
                //BoundedQueue
                //lq.add(2);
                System.out.println("LQ is " + lq);


                ArrayBlockingQueue<Integer> aq = new ArrayBlockingQueue<Integer> (1);
                aq.add(1);
                //BoundedQueue
                aq.put(2);
                System.out.println("AQ is " + aq);
        }
}
