# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to find smallest number from a given list
def min_in_list(list):

    smallest = list[0]

    for i in list:
            smallest = min(smallest, i)

    return smallest

n = int(input("Enter a size of list : "))
l = []
for i in range(n):
    l.append(int(input("Enter value : ")))

print("Smallest value in a given list : ", min_in_list(l))
