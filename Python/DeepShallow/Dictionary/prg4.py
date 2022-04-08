ls = [1, [2, 3], {4, 5}, {4 : 'Four', 5 : 'Five'}]

ls[0] = 10
ls[1][0] = 20
ls[2].add(6)
ls[3][4] = 'Six'

print(ls)
print()


wc = {'WK': ['MSD'], 'bats men' : {'Yuvraj', 'Gambhir'}, 'roles' : {'captain' : 'MSD', 'vice captain' : 'Sehwag'}}

wc['WK'].append('Robin')
wc['bats men'].add('Raina')
wc['roles']['vice captain'] = 'rohit'
print(wc)