#include<stdio.h>

void main() {

    int a = 10;

    switch(a) {

        case 9 : {
            int x = 20;
            int y = 10;
            printf("%d\n", x + y);
        }

        // " {} " are must here for cases
        case 10 : {
            int x = 20;
            int y = 10;
            printf("%d\n", x - y);
        }
    }
}
