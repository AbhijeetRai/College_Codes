
def fun():
	return {1, 2}

def gun():
	print("In gun")
	return "1.1"

def run():
	print("In run")

print(fun(), type(fun()))

print(gun(), type(gun()))

print(run(), type(run()))