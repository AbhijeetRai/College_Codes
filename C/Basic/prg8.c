#include<stdio.h>

void main() {

        /**
         * on line 9, it looks for %s to replace %s with Bagal
         * just like printf("a is %d",a) %d is replaced with value of a
         * and %s is not given but extra argument bagal is given
         * warning - too many arguments
         */
        int cnt = printf("Shashi","Bagal");
        int cnt1 = printf("%d",cnt);
        printf("%d",cnt1);
}
