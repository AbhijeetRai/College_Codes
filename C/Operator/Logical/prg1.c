#include<stdio.h>

void main() {

    int x, y, ans;

    x = 0, y = 1;
    ans = y++ || (x++ && y++);
    /**
     * Even though && has more priority than ||, && should be executed first. But grouping happens like
     * 'y++ || (x++ && y++)' and thus, '||' receives '1' at left by evaluating y++ and thus expression on
     * right of || is not evaluated. That is "x++ && y++" is not evaluated
     */
    printf("%d %d %d\n", x, y, ans);

    x = 0, y = 1;
    ans = x++ || (x++ && y++);
    /**
     * x++ was eveluated as 0 (and x incremented to 1). '||' got 0 at left. Thus expression on right of '||' had to be executed.
     * In, (x++ && y++), x++ was evaluated as 1 (x incremented to 2). '&&' got '1' at left and thus expression(y++)
     * at right of '&&' was evaluated.
     */
    printf("%d %d %d\n", x, y, ans);

    x = 0, y = 0;
    ans = x++ || (y++ && x++);
    /**
     * 'x++' on left of '||' was evaluated as 0(and x incremented to 1), thus expression on right of '||' had to be evaluated.
     * While evaluating 'y++ && x++' on right of '||'. y++ was evaluated as 0, (y incremented to 1). 0 is needed by '&&' on LEFT
     * to NOT EVALUATE, right part. Thus x++ on right of '&&' was not evaluated.
     */
    printf("%d %d %d\n", x, y, ans);
}
