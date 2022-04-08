/**
 * #error' directive is used to deliberately bring error in a code.
 * Apart from that, every header file like 'stdio.h' has defined a constant within them like '_STDIO_H'
 * 'math.h' has constant '_MATH_H' and so on.
 * 
 * These constants hold value 1, and are defined as "#define _STDIO_H 1" and "#define _MATH_H 1".
 * 
 * Now if we import header file "stdio.h" and "math.h", these constants get defined in our code, too.
 * Otherwise, not. Means if we do not have imported those header files, these constants are undefined for our program, too
 * 
 * We can use these constants, to check, if we have imported any header file, and bring error using "#error" directive.
 */

//#include<stdio.h>     //we can resolve error, by uncommenting this line

void main() {

    #ifndef _STDIO_H
        #error import stdio.h 

    #endif
}