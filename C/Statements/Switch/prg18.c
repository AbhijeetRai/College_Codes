/**
 * If nothing is executed then default is executed.
 * Default can be placed anywhere
 */

#include<stdio.h>

void main() {

    char ch = 'd';

    switch(ch) {

        case 'A' :
            printf("case A\n");
            break;

        case 'B' :
            printf("case B\n");
            break;

        case 'C' :
            printf("case C\n");
            break;

        default :
            printf("Default down\n");
            break;
    }

    switch(ch) {

        default :
            printf("\nDefault up\n");

        case 'A' :
            printf("case A\n");

        case 'B' :
            printf("case B\n");
            break;

        case 'C' :
            printf("case C\n");
            break;
    }

    switch(ch) {

        case 'A' :
            printf("case A\n");
            break;

    default :
            printf("\nDefault middle\n");

        case 'C' :
            printf("case C\n");
            break;
    }
}
