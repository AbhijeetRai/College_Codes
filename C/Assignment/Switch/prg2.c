#include <stdio.h>

void main() {

int x = 10;
int y = 20;

    switch(x) {

    case x:
    printf("Case 10\n");
    printf("x= %d\n",x);
    break;

    case y:
    printf("Case 20\n");
    printf("y= %d\n",y);
    break;

    default:
    printf("Default\n");
    break;
    }
}
//Case label only requires char or int values no variables
