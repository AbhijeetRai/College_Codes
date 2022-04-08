#include<stdio.h>

void main() {

        // x is L-value(location value), L-value can be right value(on line 7).
        int x = 10;
        int y = x;

        printf("%d %d\n", x, y);
}
