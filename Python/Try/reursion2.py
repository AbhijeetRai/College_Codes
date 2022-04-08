'''
0 1 1 2 3 5 8 13

0th term is 0. 1st term is 1. 2nd term is 1. 3rd term is 2.
4th term is 3. 5th term is 5. 6th term is 8. 7th term is 13.
'''
def fibo(n) :

	if n == 0 :
		return 0

	elif n == 1 :
		return 1

	else :
		return fibo(n - 1) + fibo(n - 2)


print(fibo(6))
