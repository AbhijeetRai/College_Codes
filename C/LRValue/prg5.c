extern int printf(const char *, ...);

void main() {

        int x = 10;
        const int y = 20;
        printf("%d %d\n", x, y);

        x = x + 1;
        //we can read value of constant variable and perfrom arithmetic operation and store result in other variable
        int z = y + 1;
        printf("%d %d\n", x, z);
}
