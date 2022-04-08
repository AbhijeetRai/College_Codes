extern int printf(const char *, ...);

void main() {
	
	int a = 5, b = 6;

	++a;
	b++;

	//incrment, decrement, only on variables, not on constants
	++10;	//error
	6++;	//error
	
	//tokenised as a++ ++ +b
	// '++' in middle has no operand
	a+++++b;	//error
}
