//Function like macro
#include<stdio.h>

#define SQR(a) a * a
#define CUBE(a) (a * (a * a))
#define FUNC(a, b) ((a + b) /a)

void main() {

        printf("%d\n", SQR(10));
        printf("%d\n", CUBE(10));
        printf("%d\n", FUNC(10, 20));
}
