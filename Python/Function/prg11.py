def worldwar() :

    def begin():
        print('1 September 1939')

    def firstattack():
        print('Germany attacks poland')

    def dunkirkevacuation():
        print('Get soldiers from dunkirk - 1940')

    def end():
        print('2 September 1945')

    return begin,firstattack,dunkirkevacuation,end

print(worldwar)
values = worldwar()

print(values[0])
print(values[1])
print(values[2])
print(values[3])

for i in values:
    print(i)
    i()
