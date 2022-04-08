/**
 * Precision for float is 7 digits (accurate value till 7 digits after decimal)
 * Precision for double is 15 digits.
 */
#include<stdio.h>

void main() {

    //no precision problem
    for(float i = 0.0; i <= 2.5; i += 0.5)
        printf("%.15f\n", i);

    printf("\n\n");

    //no precision problem
    for(double d = 0.0; d <= 1.2; d += 0.2)
        printf("%.15lf\n", d);
}
