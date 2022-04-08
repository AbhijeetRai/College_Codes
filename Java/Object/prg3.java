/**
 * equals method compares whether two distinct references (variables) point to the same object.
 * Do two different references are pointing towards same address in memory. Basically it works like == operator.
 */

class Demo {

    public static void main(String[] args) {
        
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        System.out.println(d1.equals(d2));

        /**
         * Demo class has inherited equals method from class Object and it basically looks like
         * public boolean equals(Object obj) {
         *  
         *      return (this==obj)
         * }
         */
        
        Demo d3 = d1;
        System.out.println(d3.equals(d1));
    }
}