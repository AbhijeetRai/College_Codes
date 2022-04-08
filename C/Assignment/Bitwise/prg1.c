extern int printf(const char *, ...);

void main() {

	printf("%d\n", 15 & 15);
	printf("%d\n", 10 & 4);
	printf("%d\n", -1 & 6);
	printf("%d\n", -1 & 2);
}


/**
 * To find negative representation of 1.
 * Find two's compliment of 1
 * Binary of 1 is   0000 0000 0000 0000 0000 0000 0000  0001
 *
 * Find One's compliment first that is 1111 1111 1111 1111 1111 1111 1111 1110   (flip the bits)
 *
 * Now add 1 to One's compliment
 *
 * 1111 1111 1111 1111 1111 1111 1111 1111 (this is binary representation of -1)
 *
 * Perfrom and operation on binary representation of -1
 */
