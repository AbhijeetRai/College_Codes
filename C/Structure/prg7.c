#include<stdio.h>

struct player {

    int jerNo;
    float avg;
    char grade;
}raina, ruturaj;

void main() {

    raina.jerNo = 48;
    raina.avg = 33.3;
    raina.grade = 'A';

    printf("JerseyNo of raina %d\n", raina.jerNo);
    printf("Average of raina %lf\n", raina.avg);
    printf("Grade of raina %c\n", raina.grade);

    printf("\n");

    printf("Enter jerseyNo of ruturaj\n");
    scanf("%d", &ruturaj.jerNo);

    printf("Enter average of ruturaj\n");
    scanf("%f", &ruturaj.avg);

    printf("Enter grade of ruturaj\n");
    scanf(" %c", &ruturaj.grade);

    printf("\n");

    printf("Jersey of ruturaj %d\n", ruturaj.jerNo);
    printf("Average of ruturaj %lf\n", ruturaj.avg);
    printf("Grade of ruturaj %c\n", ruturaj.grade);
}