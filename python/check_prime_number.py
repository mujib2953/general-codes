# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to check given number is prime or not
def is_prime(number):
    isPrime = True
    if number > 1:
        for i in range(2, int(number / 2) + 1):
            if number % i == 0:
                isPrime = False
                break
    else:
        isPrime = False
    print (number, "is Prime.") if isPrime else print(number, "is NOT prime.")


n = int(input("Enter a number : "))
is_prime(n)
