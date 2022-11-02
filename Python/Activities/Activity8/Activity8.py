values=list(input("Enter the sequence of numbers separated by commas").split(','))
firstnum=values[0]
lastnum=values[-1]
if(firstnum==lastnum):
    print("First and last numbers of the list are equal")
else:
    print("First and last numbers of the list are not equal")
