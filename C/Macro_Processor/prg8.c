#include<stdio.h>

void fun() {

        #define pi 3.14
}
/**
 * A macro processor or pre processor has no local scope, means
 * a macro cannot be declared locally.
 * The compiler will start replacing pi with 3.14 (in this case), throughout the program
 * even if, '#define pi 3.14' is defined locally in function fun()
 */

/**
 * Macros work on principle of copy and paste, every text stored as 'pi' will be replaced by 3.14,
 * in the entire file.
 */

 /**
  * Note -> Replacement of 'pi with 3.14' happens only if 'pi' is written below, of definition of macro
  * Because, macros follow top-down approach.
  * #include<stdio.h> can have local scope
  */
void main() {

        printf("Main %f\n", pi);
}
