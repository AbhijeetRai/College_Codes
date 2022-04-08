//There are two different ways, to dereference structure pointer

#include<stdio.h>

struct monument {

    char name[10];
    int rating;
};

void main() {

    struct monument louvre; 
    struct monument *pointer1 = &louvre;

    printf("Enter name and rating of louvre\n");
    scanf("%s %d", pointer1 -> name, &pointer1 -> rating);
    printf("%s %d\n", pointer1 -> name, pointer1 -> rating);

    struct monument notre_Dame;
    struct monument *pointer2 = &notre_Dame;

    printf("Enter name and rating of notreDame\n");
    scanf("%s %d", (*pointer2).name, &(*pointer2).rating);
    printf("%s %d\n", (*pointer2).name, (*pointer2).rating);
}