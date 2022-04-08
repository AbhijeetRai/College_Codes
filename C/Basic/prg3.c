extern int printf(const char *,...);

void main() {

        int *a;
        float *f;
        double *d;
        char *c;
        //there is no problem with declaration of void pointer
        void *v;

        printf("Size of int pointer %ld\n",sizeof(a) );
        printf("Size of float pointer %ld\n",sizeof(f) );
        printf("Size of double pointer %ld\n",sizeof(d) );
        printf("Size of char pointer %ld\n",sizeof(c) );
        printf("Size of void pointer %ld\n",sizeof(v) );

        /**
         * Size of these pointers is 8 byte
         */
}
