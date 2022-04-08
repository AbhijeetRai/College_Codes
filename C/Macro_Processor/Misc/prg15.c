void main() {

    #ifdef _STDIO_H

    #if 2 < 4
    printf("2 is less\n");

    #else 
    printf("2 is more\n");

    #endif 

    #else 
    #error declare printf

    #endif
}