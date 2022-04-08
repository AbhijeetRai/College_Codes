#include<stdio.h>

struct player {

    int jerNo;
    float avg;
    char grade;
}raina = {48}, dhoni, sachin = {};

void main() {

    printf("%d\n", raina.jerNo);
    printf("%lf\n", raina.avg);
    printf("%c\n", raina.grade);

    printf("\n");

    printf("%d\n", dhoni.jerNo);
    printf("%lf\n", dhoni.avg);
    printf("%c\n", dhoni.grade);

    printf("\n");

    printf("%d\n", sachin.jerNo);
    printf("%lf\n", sachin.avg);
    printf("%c\n", sachin.grade);
}