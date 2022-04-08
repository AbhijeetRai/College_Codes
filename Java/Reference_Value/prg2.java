class Demo {

    static void fun(String friend1, String friend2) {

        friend1 = friend1.concat(" Zagade");
        friend2 = friend2.concat(" Barvekar");

        System.out.println("Inside - > " + friend1 + " " + friend2);
    }

    public static void main(String[] args) {

        String friend1 = new String("Abhijeet");
        String friend2 = new String("Divya");

        fun(friend1, friend2);
        System.out.println("After - > " + friend1 + " " + friend2);
    }// immutable (Call by value)
}
