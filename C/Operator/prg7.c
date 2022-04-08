extern int printf(const char *, ...);

void main() {
	
	int a = 5, b = 6, ans;
	ans = a++ + b;
	printf("%d %d %d\n", a, b, ans);
	
	a = 5, b = 6, ans;
	ans = ++a + b;
	printf("%d %d %d\n", a, b, ans);

	a = 5, b = 6, ans;
	ans = a---b;
	printf("%d %d %d\n", a, b, ans);
	
	a = 5, b = 6, ans;
	ans = --a + b;
	printf("%d %d %d\n", a, b, ans);
}
