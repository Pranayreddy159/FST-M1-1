def Fib(n):
    a=1
    b=1
    print(a)
    print(b)
    for i in range(2,n):
        c=a+b
        a=b
        b=c
        print(c)

num=int(input("Enter a number-"))
res=Fib(num)
print(res)