extern int printf(const char *, ...);

void main() {

        int x = 10;
        const int y = 20;
        printf("%d %d\n", x, y);

        x = x + 1;
        //we can read value of constant variable and perfrom arithmetic operation, however we cannot modify the constant variable itself
        y = y + 1;
        printf("%d %d\n", x, y);
}
