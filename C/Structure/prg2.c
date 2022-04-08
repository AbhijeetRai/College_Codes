#include<stdio.h>

struct player {

    int jerNo;
    float avg;
    char grade;
};  

//creating local objects of structure
void main() {

    //using struct keyword is compulsory in C, but not in CPP.
    struct player dhoni = {7, 49.5, 'A'};
    struct player ruturaj;

    ruturaj.jerNo = 31;
    ruturaj.avg = 33.5;
    ruturaj.grade = 'B';
}