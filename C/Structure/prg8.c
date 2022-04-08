#include<stdio.h>

struct player {

    int runs;
    double avg;
    char grade;
}virat;

void main() {

    printf("%p %p\n", &virat, &virat.runs); //address of structure and address of first variable is same.
    printf("%p\n", &virat.avg);     //8 bytes consumed by runs, because base is of 8 bytes. 
    printf("%p\n", &virat.grade);
}