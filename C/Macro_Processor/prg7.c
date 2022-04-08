#include<stdio.h>

#define height 186
#define work()  "eat, code, sleep, repeat"
#define petname "Abhi", "Bon"
#define weights 70, 75

#undef height


void main() {

        //printf("%d\n", height);
        printf("%s\n", work());
        printf("%s %s\n", petname);
        printf("%d %d\n", weights);
}
