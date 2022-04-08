#include<stdio.h>

struct superhero {

    char *skills;
    int strength;
    int strategy;
};

//One structure can be assigned to another
void main() {

    struct superhero batman = {"Detective", 4, 8};
    struct superhero arrow = batman;

    printf("%s\n", arrow.skills);
    printf("%d\n", arrow.strength);
    printf("%d\n", arrow.strategy);
}