#include<stdio.h>

struct data1 {

        int val1;
        int val2;
}sobject;

union data2 {

        int val1;
        int val2;
}uobject;

int main(int argc, char *argv[]) {

        //seperate address for both structure values.
        printf("%p %p\n", &sobject.val1, &sobject.val2);

        //same address for both union values, because union expects
        //only one value to accomodate, at once.
        printf("%p %p\n", &uobject.val1, &uobject.val2);

        return 0;
}
