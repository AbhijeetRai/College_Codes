/**
 * printf() is kept blank in prg5 and prg6
 * we cannot keep printf() blank - it is error
 * error - too few arguments to functon printf()

 * But printf is declared by me in prg5 and not declared in 6(included by header file)
 * after compilation, while showing error
 * cc shows locatiob of printf in prg6
 */

extern int printf(const char * ,...);

void main() {

        printf("Shashi\n");
        printf();
}
