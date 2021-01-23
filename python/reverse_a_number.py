# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to reverse a number

def reverse_number(num):
    reverse = 0
    while num > 0:
        reminder = num % 10

        reverse = reverse * 10 + reminder
        num = num // 10
    return reverse

n = int(input("Enter a number : "))
print("Original number : ", n)
print("Reverse number : ", reverse_number(n))
