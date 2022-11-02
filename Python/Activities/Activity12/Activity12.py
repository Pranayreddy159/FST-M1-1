def Sum(n):
    if n:
        return n+Sum(n-1)
    else:
        return 0
result=Sum(10)
print(result)