/**
 * float can be written inside condition in 'C'
 */
extern int printf(const char *, ...);

void main() {
	
	if(2.1)
		printf("In first if\n");

	if(-2.1)
		printf("In second if\n");
}
