/*Working of calculation in 2D array.
 *
 * When we write arr[row][column], internally it becomes 
 * 
 *                    * (* (arr + row) + column) 
 * 
 * which is calculated as (for calculation use only).
 * 
 *      * ( * (arr + row * sizeof(whole 1D array)) + column * sizeof(data type of pointer))
 */

#include<stdio.h>

void main() {

    int [][4] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    printf("%d %d\n", arr[2][1], *(* (arr + 2) + 1));

    //* ( * (arr + 2) + 1) =
    //* ( * (arr + 2 * sizeof(1D array)) + 1 * sizeof(data type of pointer))
    //* ( * (arr + 2 * 16) + 1 * sizeof(int))
    //* ( * (arr + 32) + 1 * 4)
    //* ( * (arr + 32) + 4)

    //* means deference, going to somewhere, 
    //* (arr + 32) means going to arr + 32, going to arr + 32 gives us base address of row at second index

    //* (base address of row at second index + 4 bytes) means
    //The value(content) at 4 bytes from base address of row at second index will be found. 
}