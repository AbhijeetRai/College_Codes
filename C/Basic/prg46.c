extern int printf(const char *, ...);

void main() {

    int a = 5, b = 6, ans;

    ans = b++ + b++;
    printf("%d %d\n", b, ans);

    ans = a++ + a++ + a++;
    printf("%d %d\n", a, ans);

    a = 5;
    ans = a-- + a-- + a--;
    printf("%d %d\n", a, ans);
}