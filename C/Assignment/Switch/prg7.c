extern int printf(const char *, ...);
extern int scanf(const char *, ...);
#include <stdlib.h>

void main() {

    int maths, sci, pt, eng, ger;

    printf("Enter marks for maths, science, pt, eng, ger\n");
    scanf("%d %d %d %d %d", &maths, &sci, &pt, &eng, &ger);

    if(maths <= 34 || sci <= 34 || pt <= 34 || eng <= 34 || ger <= 34) {

        printf("Failed\n");
        exit(0);
    }

    else {

        switch((maths + sci + pt + eng + ger) / 5) {

            case 35 :
            case 36 :
            case 37 :
            case 38 :
            case 39 :
            case 40 :   printf("Third class\n");
                        break;

            case 41 :
            case 42 :
            case 43 :
            case 44 :
            case 45 :
            case 46 :
            case 47 :
            case 48 :
            case 49 :
            case 50 :
            case 51 :
            case 52 :
            case 53 :
            case 54 :
            case 55 :
            case 56 :
            case 57 :
            case 58 :
            case 59 :   printf("Second class\n");
                        break;

            default : printf("First class\n");
        }
    }
}
