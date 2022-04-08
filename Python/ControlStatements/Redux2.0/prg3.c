/**
 * In 'C', there is no issue if we write something immediately beneath continue and break
 */

extern int printf(const char *, ...);

void main() {
	
	for(int i = 1; i <= 5; i++) {
		
		if(i == 2) {
			
			continue;
			printf("i is 2");
		}

		else if(i == 4) {
			
			break;
			printf("i is 4");
		}

		else
			printf("%d ", i);
	}
	printf("\n");
}
