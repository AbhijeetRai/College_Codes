class Demo {

        static int a;
        static int b = 20;

        static {

                a = 100;
                b = 200;
        }
}

/*

static {};
  Code:
     0: bipush        20
     2: putstatic     #2                  // Field b:I
     5: bipush        100
     7: putstatic     #3                  // Field a:I
    10: sipush        200
    13: putstatic     #2                  // Field b:I
    16: return

*/
