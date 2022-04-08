#include<stdio.h>

void main() {

        //void a;               //Error - variable or field 'a' declared void
        //void ar[10];          //Error - declaration of ‘ar’ as array of voids
        //void as primitive data type is not acceptable


        void *a1;
        void *ar1[10];
        //but pointer of void is acceptable

        printf("%ld\n", sizeof(void));
        //just for FORMALITY size of void is 1
}
