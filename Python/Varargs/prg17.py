def fun(**krgs):

    for i in krgs:
        print(i, end = " ")
    print()

    for i in krgs:
        print(krgs[i], end = " ")
    print()

    print("\n", krgs)

fun(a = 10, b = 20, c = 30)

