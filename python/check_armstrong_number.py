# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to check armstrong or not

def check_armstrong(num):

    sum = 0
    temp = num
    while temp > 0:
        lastDigit = temp % 10
        sum += lastDigit ** 3

        temp = temp // 10
    return "Yes" if num == sum else "No"

n = int(input("Enter a number : "))

print("Entered number : ", n)
print("Is armstrong or not : ", check_armstrong(n))
