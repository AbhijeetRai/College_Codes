//XOR operator

/**
 * TRUTH TABLE (give 0 for same bits)

 	Bit-1	Bit-2	XOR
	 0	 0	 0
	 0	 1	 1
	 1	 0	 1
	 1 	 1	 0
 */

#include<stdio.h>

void main() {
	
	int x = 10,y = 15, ans;
	ans = x ^ y;
	printf("%d\n", ans);

	printf("%d\n", 7 ^ 5);
}
