extern int printf(const char *, ...);

void main() {

    int b = 6;
    int ans = ++b + ++b + ++b;
    printf("%d %d\n", b, ans);
}