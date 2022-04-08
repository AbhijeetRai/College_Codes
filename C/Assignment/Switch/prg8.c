#include<stdio.h>

void main() {

    int value;

    printf("Enter the value between 0 to 5\n");
    scanf("%d", &value);

    switch(value) {

        case 1 :
            printf("One\n");
            break;

        case 0 :
            printf("Zero\n");
            break;

        case 2 :
            printf("Two\n");
            break;

        default :

            if(value > 5) {

                printf("Greater than five\n");
                break;
            }else if(value < 0) {
                printf("Smaller than 0\n");
                break;
            }

        case 3 :
            printf("Three\n");
            break;

        case 4 :
            printf("Four\n");
            break;

        case 5 :
            printf("Five\n");
            break;
    }
}
