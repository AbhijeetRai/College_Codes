def outerfun():
    def innerfun():
        print('Val1')

    print('val2')
    return innerfun

i  = outerfun()
i()
