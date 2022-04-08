#include<stdio.h>

void main() {

        int a = 10;
        double d = 2.5;

        printf("Sze of int %ld\n",sizeof(a));
        printf("Sze of int %ld\n",sizeof(int));
        printf("Sze of int %ld\n",sizeof(10));
        printf("Sze of int %ld\n",sizeof(12));

        printf("\n");

        printf("Sze of double %ld\n",sizeof(d));
        printf("Sze of double %ld\n",sizeof(double));
        printf("Sze of double %ld\n",sizeof(2.5));
        printf("Sze of double %ld\n",sizeof(1.3));
}
