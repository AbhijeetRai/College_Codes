#include <stdio.h>

int main() {

    int a;
    //sizeof() returns unsigned int, -1 being a signed value, converts into very large unsigned value for comparison
    switch(a = (sizeof(int) > -1)) {

        case 1: printf("True\n");
        break;

        case 0: printf("False\n");
        break;
    }

    return 0;
}
