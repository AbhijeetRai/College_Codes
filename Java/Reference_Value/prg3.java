class Demo {

    static void fun(int a, float b) {

        a = 21;
        b = 6.0f;

        System.out.println("In fun " + a + " " + b);
    }

    public static void main(String[] args) {

        int a = 20;
        float b = 5.11f;

        fun(a, b);
        System.out.println("In main " + a + " " + b);
    }
}
