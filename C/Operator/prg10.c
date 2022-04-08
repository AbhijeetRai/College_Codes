extern int printf(const char *, ...);

void main() {
	
	int a = 5, b = 6, c = 7, ans = 0;
	ans = ++a + b++ + ++c;
	printf("%d %d %d %d\n",a, b, c, ans);
}
