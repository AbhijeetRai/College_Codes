extern int printf(const char *, ...);

void main() {
	
	int x = 12, y = 13, ans = 0;
	
	ans = x > y;
	printf("%d\n", ans);
	
	ans = x < y;
	printf("%d\n", ans);
	
	ans = x >= y;
	printf("%d\n", ans);

	ans = x <= y;
	printf("%d\n", ans);

	ans = x == y;
	printf("%d\n", ans);

	ans = x != y;
	printf("%d\n", ans);
}
