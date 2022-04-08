extern int printf(const char *, ...);

void main() {

    int a = 7, b = 8, ans;
    ans = ++a + ++a + ++a;
    printf("%d %d\n", a, ans);

    ans = --b + --b + --b;
    printf("%d %d\n", b, ans);
}