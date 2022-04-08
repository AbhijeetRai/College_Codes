#include<stdio.h>

enum week {

        mon = 'a',
        tue = 'A'
};
//character and integer allowed in enum
int main(int argc, char const *argv[]) {

        printf("%d %d\n", mon, tue);
        return 0;
}
