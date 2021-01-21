# Author: Mujib Ansari
# Dat: Jan 21, 2021

# Problem Statement: WAP to find even and odd for a given number

def odd_or_even(num):
    if num % 2 == 0:
        print(num, "is EVEN.")
    else:
        print(num, "is ODD")


value = int(input("Please enter any number: "))
odd_or_even(value)
