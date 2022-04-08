#give 2,3 command line arguments

from sys import argv
print(argv[0])
print(argv[1])
print(argv[2])
print(argv)

print()
argv.insert(0,'CPP')
print(argv)
argv.append('Android')
print(argv)

print()

print(len(argv))
print()
for x in range(len(argv)) :
    print(argv[x])
