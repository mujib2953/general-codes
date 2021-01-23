# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to find largest number from a given list
def max_in_list(list):

    largest = list[0]

    for i in list:
            largest = max(largest, i)

    return largest

n = int(input("Enter a size of list : "))
l = []
for i in range(n):
    l.append(int(input("Enter value : ")))

print("Maximum value in a given list : ", max_in_list(l))
