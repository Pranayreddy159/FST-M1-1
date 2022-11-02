fruits = {
    "apple": 35,
    "pomegranate": 45,
    "peaches": 18,
    "banana": 5
}
check_fruit = input("Enter the fruitr you want to check the availability").lower()
if(check_fruit in fruits):
    print(check_fruit+" is available")
else:
    print(check_fruit+" is not available")