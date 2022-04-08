#include<stdio.h>

struct player {

    int jerNo;
    float avg;
    char grade;
};

void main() {

    struct player raina;

    printf("Enter jerseyNo of raina\n");
    scanf("%d", &raina.jerNo);

    printf("Enter average of raina\n");
    scanf("%e", &raina.avg);

    printf("Enter grade of raina\n");
    scanf(" %c", &raina.grade);

    printf("Jersey no of raina %d\n", raina.jerNo);
    printf("Average of raina %f\n", raina.avg);
    printf("Grade of raina %c\n", raina.grade);
}