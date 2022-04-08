#include<stdio.h>

void main() {

    int x, y, ans;

    x = 0, y = 1, ans;
    ans = x++ && y++;
    /**
     * '&&' gets 0 on left, thus expression on right (y++) is not evaluated
     */
    printf("%d %d %d\n", x, y, ans);

    x = 1, y = 1, ans;
    ans = x++ && y++;
    /**
     * '&&' gets 1 on left, thus expression on right(y++) is evaluated.
     */
    printf("%d %d %d\n", x, y, ans);
}
