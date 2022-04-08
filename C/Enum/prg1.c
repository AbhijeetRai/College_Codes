#include <stdio.h>

/**
 * Enum is used to, pair integer with words.
 */

enum week {

        sun,
        mon,
        tue
};

int main(int argc, char *argv[]) {

        printf("%d %d %d\n", sun, mon, tue);

        enum year {

                jan,
                april = 4,
                may,
        };

        printf("%d %d %d\n", jan, april, may);
}
