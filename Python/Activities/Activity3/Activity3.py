
Player1 = input("What is Player 1's name? ")
Player2 = input("What is Player 2's name? ")
u1 = input(Player1 + ", do you want to choose rock, paper or scissors? ").lower()
u2 = input(Player2 + ", do you want to choose rock, paper or scissors? ").lower()
if u1 == u2:
    print("It's a tie!")
elif u1 == 'rock':
    if u2 == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif u1 == 'scissors':
    if u2 == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif u1 == 'paper':
    if u2 == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")