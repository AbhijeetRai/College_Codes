wc = {'captain' : 'ganguly', 7 : 'msd'}

print('Address of wc[captain] before is', id(wc['captain']), wc)
wc['captain'] = 'dhoni'
print('Address of wc[captain] after is', id(wc['captain']), wc)
print()
#Address will be different because string is immutable

wc = {'wk': ['MSD', 'Robin'], 7  : 'MSD'}
print('Address of wc[wk] before is ', id(wc['wk']), wc)
wc['wk'][0] = 'Dravid'
print('Address of wc[wk] after is', id(wc['wk']), wc)
#Address will be same because list is mutable