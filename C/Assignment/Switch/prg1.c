#include <stdio.h>

void main() {

    int a = 20;

    switch(~a) {

    case 20:
    printf("Case 20\n");
    printf("a = %d\n",a);
    break;

    case -20:
    printf("Case -20\n");
    printf("a = %d\n",a);
    break;

    case -21:
    printf("case -21\n");
    printf("a = %d\n",a);
    break;

    default:
    printf("default\n");
    break;
    }
}
