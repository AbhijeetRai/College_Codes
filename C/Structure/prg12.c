#include<stdio.h>

//Structure which holds, top 3 names 
//for purple cap
struct batsman {

    char name[10];      //runs in IPL 2020
    int runs;
}array[3];

void main() {

    //There are 3 different ways to access elements
    //from structure array(shown as below)

    printf("Enter name and runs of Batsman 1\n");
    scanf("%s %d", array[0].name, &array[0].runs);
    printf("%s %d\n", array[0].name, array[0].runs);

    printf("\n");

    printf("Enter name and runs for batsman 2\n");
    scanf("%s%d", (array + 1) -> name, &(array + 1) -> runs);
    printf("%s %d\n", (array + 1) -> name, (array + 1) -> runs);

    printf("\n");

    printf("Enter name and runs for batsman 3\n");
    scanf("%s %d", (*(array + 2)).name,  &(*(array + 2)).runs);
    printf("%s %d\n", (*(array + 2)).name, (*(array + 2)).runs);
}