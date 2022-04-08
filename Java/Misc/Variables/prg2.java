class Demo {

        int a;
        int b = 10;

        Demo() {

                a = 100;
                b = 200;
        }
}

/*
Compiled from "prg2.java"
class Demo {
  int a;

  int b;

  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field b:I
      10: aload_0
      11: bipush        100
      13: putfield      #3                  // Field a:I
      16: aload_0
      17: sipush        200
      20: putfield      #2                  // Field b:I
      23: return
}
*/
