extern int printf(const char *, ...);

void main() {

	printf("%d\n",~ 35);         //(positive_no + 1) and then 2s compliment
	printf("%d\n",~ -35);	     //(negative_no + 1) and then 2s compliment

	printf("%d\n", ~4);
	printf("%d\n", ~-4);
}

/**
 * Rule is simple.

 * Does not matter whether the number is negative or positive.
 * Just take the number(with sign) and add 1 to the number.
 * Change the sign of result after adding.
 */
