#include <stdio.h>

/**
 * Whenever we try to communicate with a file on hardisk, from program. 
 * That communication does not happen directly. There exists a stream between code and hardisk file.  
 * That stream is structure object of type FILE. For every file, such stream will be opened. 
 * (such structure object will come in existence) for every file. 
 */

void main() {

    printf("%d\n", stdin -> _fileno);
    printf("%d\n", stdout -> _fileno);
    printf("%d\n", stderr -> _fileno);

    FILE *fp;                           //to look at that structure instance
    fp = fopen("random.txt", "w");      //structure instance opened to communicate with random.txt
    printf("%d\n", fp -> _fileno);



    
}