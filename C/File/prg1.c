/**
 * When we compile, any program(say, prg1.c) with '-E' flag, say "cc -E prg1.c".
 * We can see that, there is a structure inside compiled result, called
 * 
 * struct _IO_FILE {
 * };
 * 
 * We can also find a line like "typedef struct _IO_FILE FILE".
 * So, it is evident variable "FILE" is of structre datatype. 
 * 
 * FILE structure has size 216 bytes
 */

#include<stdio.h>

void main() {

    printf("%ld\n", sizeof(FILE));

    FILE *fp, *fp1;           //pointer to FILE (structure)

    printf("%ld %ld\n", sizeof(fp), sizeof(fp1));
}