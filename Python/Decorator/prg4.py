
cache = {}
def dec(func) :


    def inner(n) :

        if n in cache :
            print('In cache')
            return cache[n]

        else :
            cache[n] = func(n)
            return cache[n]

    return inner


@dec #equivalent to fib = dec(fib)
def fib(n) :

    if n == 0 or n == 1:
        return n

    else :
        return fib(n - 1) + fib(n - 2)

value = fib(3)
print(value)
print(cache)
