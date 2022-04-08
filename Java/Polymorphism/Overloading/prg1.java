class Demo {

    static void fun(float a, float b) {

        System.out.println("Floats are " + a + " " + b);
    }

    static void fun(int a, int b) {

        System.out.println("Integers are " + a + " " + b);
    }

    public static void main(String[] args) {

        fun(10, 10);
        //there is choice to whether upcast char to int or float
        //int is chosen, because upcasting to lower degree or to child class than parent class is prefered
        fun('A', 'B');
    }
}
