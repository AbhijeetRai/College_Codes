extern int printf(const char *, ...);

void main() {
	
	printf("%d\n", 11 | 11);
	printf("%d\n", 9 | 10);
	printf("%d\n", -1 | 6);
	printf("%d\n", -1 | 2);
}

/**
 * Binary of -1 is 1111 1111 1111 1111 1111 1111 1111 1111
 *
 * After performing or of -1 with 2 and -1 with 6
 * We got 1111 1111 1111 1111 1111 1111 1111 1111
 *
 * Which is nothing but -1 itself
 */
