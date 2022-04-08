#include <stdio.h>

void fun() {

        //local enum, not visible to fun
        //printf("%d %d\n", false, true);
}

int main(int argc, char *argv[]) {

        enum boolean {

                false,
                true
        };

        printf("%d %d\n", false, true);
        fun();
}
