#include<stdio.h>
#include<stdlib.h>

void main() {

    int num1, num2;

    printf("Enter two numbers\n");
    scanf("%d %d", &num1, &num2);

    if(num1 < 0 || num2 < 0) {

        printf("Negative number not allowed\n");
        exit(0);
    }

    int mult = num1 * num2;

    switch(num1 % 2 == 0 && num2 % 2 == 0) {

            case 0 :

                switch(num1 % 2) {

                    case 1 :
                        printf("%d num1 is odd\n", num1);
                }

                switch(num2 % 2) {

                    case 1 :
                        printf("%d num2 is odd\n", num2);
                }
                    break;

            case 1 :
                printf("Both numbers are even\n");
                break;
    }
}
