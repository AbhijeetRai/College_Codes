class Demo {

    int a;
    static String b;

    public static void main(String[] args) {

	//instance and static variables are by default initialised
        System.out.println(new Demo().a);
        System.out.println(b);

        char ch;
        //System.out.println(ch);     //local variables are not initialised by default
    }
}
