#include<stdio.h>

void main() {

        int a = 3,b;
        b = ++a + a++;
        printf("%d\n",b);


        a = 3;
        b = a++ + --a + a++ + ++a;
        printf("%d\n",b);


        a = 6;
        b = a-- + a++ + --a + ++a + a;
        printf("%d\n",b);

	a = 10, b = 4;
	a = ++a + ++a + ++b + ++b;
	/**
	 * follow normal rules of pre and post 
	 * first do ( ++a + ++ a) then return two "References of a" not "values". Add those two references
	 * then add result of '++a + ++a' to ++b, then add sum of '++a + ++a + ++b' to last ++b
	 */
	printf("%d\n", a);

}
