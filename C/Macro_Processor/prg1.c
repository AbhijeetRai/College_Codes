//Macro Processor is called as pre processor

//#include <color.h>    //This does not work because angular brackets look for header file in '/usr/include' only.
                        //Not in current directory

#include "color.h"      //double quotes look in current directory
#include "stdio.h"      //double quotes look in '/usr/include' as well.

#include<stdlib.h>      //angular brackets look only in '/usr/include'

int main(int argc, char *argv[]) {

        red();
        printf("Hello, World!\n");
        purple();
        printf("Bye, World!\n");
}
