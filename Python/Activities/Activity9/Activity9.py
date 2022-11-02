list1 = [2, 45, 12, 954, 345]
list2 = [56, 64, 65, 35, 75]
print("List 1", list1)
print("List 2", list2)
list3 = []
for num in list1:
    if (num % 2 != 0):
        list3.append(num)
for num in list2:
    if (num % 2 == 0):
        list3.append(num)
print("result List is:")
print(list3)