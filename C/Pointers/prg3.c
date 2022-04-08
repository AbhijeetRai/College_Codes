extern int printf(const char *, ...);

void main() {

        int a = 10;
        int* iptr = &a;
        printf("Integer a is %d\n", a);
        printf("Value pointed by Integer pointer is %d\n", *iptr);
        printf("Address of a is %p\n", &a);
        printf("Address stored in Integer pointer is %p\n", iptr);
        printf("Address of Integer pointer is %p\n\n", &iptr);

        char ch = 'A';
        char* cptr = &ch;
        printf("Value of ch is %c\n", ch);
        printf("Value pointed by pointer is %c\n", *cptr);
        printf("Address of ch is %p\n", &ch);
        printf("Address stored in pointer is %p\n", cptr);
        printf("Address of pointer is %p\n\n", &cptr);

        float f = 1.1;
        float* fptr = &f;
        printf("Value of f is %f\n", f);
        printf("Value pointed by pointer is %f\n", *fptr);
        printf("Address of f is %p\n", &f);
        printf("Address stored in pointer is %p\n", fptr);
        printf("Address of pointer is %p\n\n", &fptr);

        double d = 69.00;
        double* dptr = &d;
        printf("Value of d is %lf\n", d);
        printf("Value pointed by pointer is %lf\n", *dptr);
        printf("Address of d is %p\n", &d);
        printf("Address stored in pointer is %p\n", dptr);
        printf("Address of pointer is %p\n", &dptr);
}
