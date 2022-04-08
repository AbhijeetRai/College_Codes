#include<stdio.h>

struct player {

    int jerNo;
    float avg;
    char grade;
};

void main() {

    struct player raina;
    struct player dhoni = {};
    struct player sachin = {10};

    printf("%d\n", raina.jerNo);
    printf("%f\n", raina.avg);
    printf("%c\n", raina.grade);

    printf("\n");

    printf("%d\n", dhoni.jerNo);
    printf("%f\n", dhoni.avg);
    printf("%c\n", dhoni.grade);

    printf("\n");

    printf("%d\n", sachin.jerNo);
    printf("%f\n", sachin.avg);
    printf("%c\n", sachin.grade);
}   