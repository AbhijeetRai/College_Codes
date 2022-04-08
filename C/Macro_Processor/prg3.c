#include<stdio.h>

#define names "Abhijeet", "Rai", "Ram Narayan"
#define heights 185, 170, 165

void main() {

        char *name[] = {names};
        double height[] = {heights};

        for(int i = 0; i < 3; i++)
                printf("%s %f\n", name[i], height[i]);
}
