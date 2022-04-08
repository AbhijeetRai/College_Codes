extern int printf(char const *, ...);

void fun();

void main(void main()) {

        fun(10,20,30,40,50);
}

void fun() {

        float a;
        float *ptr = &a;
        a = 30;
        printf("%f ",*ptr);
}
