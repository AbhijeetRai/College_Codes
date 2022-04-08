/**
 * Operating system, (interface of Hardware and software) is all about processes and files.
 * (In C) input and output operation is performed via files of monitor(stdout) and keyboard(stdin).
 * 
 * If we close stdout and stdin. We cannot print or show anything on monitor, 
 * nor we can accept input via keyboard 
 * 
 * This is as good as dead code.
 */


#include<stdio.h>

void main() {

    int value;
    printf("Enter a value\n");
    fclose(stdin);
    scanf("%d", &value);

    fclose(stdout);
    printf("Hello, World!\n");
}