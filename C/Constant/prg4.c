#include<stdio.h>

void main() {

        const int first,third;
        int second;

        /**
         * We can scan values in const variables any number of times
         */
        printf("Enter first,second and third\n");
        scanf("%d%d%d",&first,&second,&third);
        printf("first = %d\nsecond = %d\nthird = %d\n",first,second,third);


        printf("Enter first,second and third\n");
        scanf("%d%d%d",&first,&second,&third);
        printf("first = %d\nsecond = %d\nthird = %d\n",first,second,third);

        /*
        /**
         * Error on 25 and 27
         * Assignment of read only variable
         */
        //first = first + 1;
        second = second + 2;
        //third = third + 3;

}
