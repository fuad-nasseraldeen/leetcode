a = [5,3,4,6,21,41,661,3,3,3,3,3,3,21,1,1,6,7,8,9,0,5,3,288]
right = len(a)-1
left = 0
while left<right:
    while a[left]%2==0 and left<right :
        left += 1
    while a[right]%2==1 and left<right :
        right = right-1
    if left < right:
           a[left],a[right] = a[right],a[left]
print(a)           

