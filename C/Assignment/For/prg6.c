#include<stdio.h>

void main() {

    int i = 65;

    for(; i <= 90; ++i)
        printf("%c = %c\n", (char)i, (char)i + 32);
}
