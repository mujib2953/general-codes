# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to check given number is palindorome or not

def check_palindorme(num):

    temp = num
    reverse = 0
    while temp > 0:
        lastDigit = temp % 10
        reverse = (reverse * 10) + lastDigit

        temp = temp // 10
    return "Yes" if num == reverse else "No"

n = int(input("Enter a number : "))

print("Entered number : ", n)
print("Is palindrome or not : ", check_palindorme(n))
