#include<stdio.h>

struct batsman {

    int runs;
    double average;
};

//Array of structure pointer
void main() {

    struct batsman faf;
    struct batsman watson;

    struct batsman* ptrArr[] = {&faf, &watson};

    printf("Enter details for faf\n");
    scanf("%d %lf", &ptrArr[0] -> runs, &ptrArr[0] -> average);
    printf("%d %.2lf\n", ptrArr[0] -> runs, ptrArr[0] -> average);

    printf("Enter details for watto\n");
    scanf("%d %lf", &(*ptrArr[1]).runs, &(*ptrArr[1]).average );
    printf("%d %lf\n", (*ptrArr[1]).runs, (*ptrArr[1]).average);
}