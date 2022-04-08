#include<stdio.h>

void main() {

    int val;

    printf("Enter value\n");
    scanf("%d", &val);

    for(int i = 1; i <= val / 2; i++) {

        if(val % i == 0)
            printf("%d\n", i);
    }

    printf("%d\n", val);
}
