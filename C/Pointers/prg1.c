#include<stdio.h>

void main() {

        //pointer might be pointing to some random memory location, which we might not be allowed to access, by os.
        //thus we get segmenation fault
        //int *pointer;
        //printf("%d\n", *pointer);


        //it is good practise to initialise pointer with 0 or NULL
        float *pt = NULL;
        printf("Float is\n");
        printf("%f\n", *pt);    //segmenation falut is inevitable, even if follow good practise.
}
