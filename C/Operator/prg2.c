/**
 * Before going to pre and post increment.
 * Cosnider this analogy
 * When pre increment or post increment is called on variable 'a' (Say) (a++ or ++a)
 * A function is called


       *** For pre increment
                a = a+1
                return a

        *** For post increment
                temp = a
                a = a + 1
                return temp
 */

#include<stdio.h>

void main() {

        int a = 10;
        int b;

        b = ++a;
        // Now a = 11 and b = 11
        printf("a = %d\tb = %d\n",a,b);

        b = a++;
        // Now a = 12 and b = 11
        printf("a = %d\tb = %d\n",a,b);

        a = a++;
        //firstly temp stored 12
        //then a became 13
        //but lastly temp was returned and stored in a again, hence a is 12 again
        printf("a = %d\n",a);


        a = ++a;
        //a = 13
        printf("a = %d\n",a);

        a++;
        //temp stored 13 first.
        //Then a became 14
        //But there is nothing to catch returning temp(13).
        // a remains 14
        printf("a = %d\n",a);
}
