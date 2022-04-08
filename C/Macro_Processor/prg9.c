#include<stdio.h>
void fun();

void main() {
        /**
         * Macros use top down approach, main cannot see 'pi' yet.
         * Because 'pi' is used before or above, defintion of macro.
         * It should have been below definition of macro
         */
        
        /**
         * Macros are immune to call of stack, they do not care about calls of stack
         * Their scope, definition and visibility is affected by top down approach.
         * Stack calls are handled runtime, after creation of executable a.out 
         */

        /**
         * Macros on other hand are replaced during pre prcoessing. (Step 1 of compilation)
         * Hence macros are immune to calls of stack and are affected by top down appraoch
         */

        fun();
        printf("%f\n", pi);
        fun();
}

void fun() {

        #define pi 3.14
}
