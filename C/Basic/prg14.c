#include<stdio.h>

void main() {

        int a;
        int b = 20;

        //%p is used to show hex representation of virtual memory
        //this representation is virtual and thus address allocation is continuous
        //os does not show show physical memory
        //physical memory may be or may not be continous
        printf("%p\n",&a);  //80
        printf("%p\n",&b);  //84

        printf("%d\n",a);
        printf("%d\n",b);
}
