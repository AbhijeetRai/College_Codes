#include <stdio.h>

#define val1 10
#define val2 20


enum month {

        jan = val1,
        feb = val2
};

int main(int argc, char *argv[]) {

        printf("%d %d\n", jan, feb);
        return 0;
}
