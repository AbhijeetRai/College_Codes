#include<stdio.h>

void main() {

    //precision problem
    //float value like 1.200000047683716(after being promoted, for comparison with double 1.2, which leads to loss of precision in float)
    //is being compared to (<=) double 1.200000000000000
    //which turns out to be false, hence end point is 1.00
    for(float d = 0.0f; d <= 1.2; d += 0.2)
        printf("%.15lf\n", d);

    printf("\n\n");

    for(float d = 1.0; d <= 2.8f; d += 0.2)
        printf("%.15lf\n", d);
}
