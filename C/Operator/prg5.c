/**
 * Increment Decrement has higher prioirty than arithmetic operator priority.
 */

extern int printf(const char *, ...);

int main() {

	int a = 10, b = 4;
	a = ++a + a / b++ + ++a * ++b;

	/**
	 * CASE1
	 * put values one by one.
	 * then follow precendence from left to right
	 * 11 + (11 / 4) + (12 * 6)
	 */
	printf("%d\n", a);

	a = 10, b = 4;
	a = ++a * b + ++a + ++b + b++;

	/**
	 * CASE2
	 * put values one by one,
	 * then follow precedence from left to right
	 * (11 * 4) + 12 + 5 + 5
	 */
	printf("%d\n", a);

	a = 10, b = 4;
	a = ++a + ++a + ++b + ++b;
	/**
	 * CASE3
	 * follow normal rules of pre and post
	 * first do ( ++a + ++ a) then return two "References of a" not "values". Add those two references
	 * then add result of '++a + ++a' to ++b, then add su of '++a + ++a + ++b' to last ++b
	 */
	printf("%d\n", a);
}
