extern int printf(const char *, ...);

void main() {
	
	int x = 8, ans;

	ans = ++x + x++;
	/**
	 * for '++x'
	 * 	increment x by 1, return reference of x.
	 * 	x is 9 now. And equation is 'x + x++'
	 *
	 * for 'x++'
	 * 	"temp" is equal to x that is "9".
	 * 	Increment x by 1, "x is 10" now.
	 * 	return temp. Equation is 'x + temp'
	 *
	 * 	10 + 9
	 */
	printf("%d\n", ans);


	x = 3;
	ans = ++x + x++ + --x + x--;
	printf("%d %d\n", x, ans);
}
