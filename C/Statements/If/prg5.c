extern int printf(const char *, ...);

int main() {

	printf("INSIDE BLOCK\n");
	
	//a block can be independent part in C.
	{
		
		printf("HI FROM BLOCK\n");
		printf("HELLO FROM BLOCK\n");
	}

	printf("OUT OF BLOCK\n");
}
