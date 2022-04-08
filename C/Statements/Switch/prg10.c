extern int printf(const char *, ...); 
	
void main() {

	char rating = 'R';
	int a = 1;

	switch('R') {
		
		//actual value is required in case label. Not variable
		//variable can be used in expression of switch
		case rating :
			printf("Captain America\n");

		case a:
			printf("Iron Man\n");
	}
}
