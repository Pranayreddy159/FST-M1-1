def Sum(n):
    sum=0
    for i in n:
        sum+=int(i)
    return sum
a=list((input("enter the sequence of numbers seperated by commas").split(',')))        
result=Sum(a)    
print(result)


