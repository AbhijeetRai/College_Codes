extern int printf(const char *, ...);

void main() {

    int a = 5;
    int ans = ++a + ++a;
    printf("%d %d\n", a, ans);
}