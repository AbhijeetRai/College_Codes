extern int printf(const char *, ...);

int main() {

        int val1 = 1, val2 = 2;
        const int val3 = 3, val4 = 4;

        printf("%d %d %d %d\n", val1, val2, val3, val4);

        val1 += 1;
        val2 += 1;
        //val3 += 1;  //Error(assignment of read only variable)
        //val4 += 1;  //Error(assignment of read only variable)

        printf("%d %d %d %d\n", val1, val2, val3, val4);
}
