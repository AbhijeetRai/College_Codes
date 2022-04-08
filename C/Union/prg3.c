#include<stdio.h>

union data2 {

        int val1;
        int val2;
};

int main(int argc, char *argv[]) {

        //union expects only one value at once, for memory optimisation.
        //value is put from right to left. Islie answer 10
        union data2 object = {10, 20};
        printf("%d %d\n", object.val1, object.val2);
}
