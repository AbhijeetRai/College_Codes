from sys import argv


s = 'argv[1] + argv[2] + argv[3]'
ans = eval(s)
print(ans)


s = 'int(argv[1]) + int(argv[2]) + int(argv[3])'
ans = eval(s)
print(ans)
