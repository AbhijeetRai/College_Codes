#include<stdio.h>

void main() {

        //warning - %s looks for a value(string) to replace itself 
        int cnt = printf("Shashi%s");
        int cnt1 = printf("%d",cnt);
        printf("%d",cnt1);
}
