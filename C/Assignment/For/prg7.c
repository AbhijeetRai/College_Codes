#include<stdio.h>

void main() {

    int value, range;

    printf("Enter the value\n");
    scanf("%d", &value);

    printf("Enter upper most range\n");
    scanf("%d", &range);

    for(int i = value; i <= range; i += value)
        printf("%d\t", i);

    printf("\n");
}
