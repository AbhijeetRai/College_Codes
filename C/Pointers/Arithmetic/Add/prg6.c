/**
 * WE know for, "datatype *ptr" 
 * ptr + n = ptr + n * sizeof(datatype of ptr).
      
 * And suppose we add ptr with any character, character's ASCII value will be considered.
 * ptr + 'A' = ptr + 65
 * ptr + 65 * sizeof(datatype of ptr)
 */

#include <stdio.h>
void main() {

    int a = 10;
    int *ptr = &a;

    int val1 = ptr;
    printf("Integer pointer firstly at %d\n", val1);

    ptr = ptr + 'A';
    //ptr = ptr + 65
    //ptr = ptr + 65 * sizeof(data type of ptr)
    //ptr = ptr + 65 * sizeof(int)
    //ptr = ptr + 65 * 4
    //ptr = ptr + 260

    int val2 = ptr;
    printf("Integer pointer later at %d\n", val2);

    printf("The difference is %d\n", val2 - val1);
}