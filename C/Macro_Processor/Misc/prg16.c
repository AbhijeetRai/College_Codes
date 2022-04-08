#define _STDIO_H

void main() {

    //atleast even if not from stdio.h, we have defined _STDIO_H

    #ifndef _STDIO_H        
    #error not defined
    #endif
}