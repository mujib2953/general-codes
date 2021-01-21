# Author: Mujib Ansari
# Dat: Jan 21, 2021

# Problem Statement: WAP to find sum of number in the list using function

def getSumFromList(list):
    sum = 0
    for i in list:
        sum += i

    return sum

size = int(input("Enter the number of elements in the list :"))
list = []
for i in range(size):
    x = int(input("Enter the number : "))
    list.append(x)

print("The sum of all number is", getSumFromList(list))
