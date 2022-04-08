#include<stdio.h>

void main() {

        int a = 10;
        char ch = 'Z';
        float f = 15.8;
        double d = 20.79;

        printf("%d\n",a);
        printf("%c\n",ch);
        printf("%f\n",f);
        printf("%lf\n",d);

        printf("\n");

        printf("%p\n",&a);
        printf("%p\n",&ch);
        printf("%p\n",&f);
        printf("%p\n",&d);
}
