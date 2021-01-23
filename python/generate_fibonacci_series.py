# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to generate fibonacci series
def fibo(n):
    # print(number)
    if n < 0:
        print("Invalid input.")
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibo(n - 1) + fibo(n - 2)

number = int(input("Enter a number : "))
print(fibo(number))
