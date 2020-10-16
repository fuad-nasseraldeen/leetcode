def my_function():
	a=eval(input('please enter an array'))
	k=eval(input('please enter an k '))
	summm=0
	for i in range(len(a)):
		for j in range(i+1,len(a)):
			if((a[i]+a[j])%k==0):
            	print(a[i],',',a[j])
				summm+=1
	return summm
