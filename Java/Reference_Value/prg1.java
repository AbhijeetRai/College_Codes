class Demo {

    static void fun(StringBuffer friend1, StringBuffer friend2) {

        friend1.append(" Zagade");
        friend2.append(" Barvekar");

        System.out.println("Inside - > " + friend1 + " " + friend2);
    }

    public static void main(String[] args) {

        StringBuffer friend1 = new StringBuffer("Abhijeet");
        StringBuffer friend2 = new StringBuffer("Divya");

        fun(friend1, friend2);
        System.out.println("After - > " + friend1 + " " + friend2);
    }   //mutable(call by reference)
}
