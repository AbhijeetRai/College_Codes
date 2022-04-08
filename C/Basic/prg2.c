/**
 * Size of various data types
 */

extern int printf(const char * ,...);

void main() {

        int a;
        float b;
        double d;
        char c;

        /**
         * In function main, variable or field v declared void
         * This means whenever a variable is declared, some memory is allocated to it
         * But practically to void no memory is allocated, so we cannot decalre void

        void v;
        or
        void v = 10;
         */

        //argument 2 has type long unsigned it
        //thus use %ld instead of %d
        printf("int size - %ld\n",sizeof(a));
        printf("float size - %ld\n",sizeof(b));
        printf("double size - %ld\n",sizeof(d));
        printf("char size - %ld\n",sizeof(c));

        //But just for representation, size of void is 1
        printf("Void size - %ld\n",sizeof(void));
}
