# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to remove duplicate values from given list
def remove_duplicate(l):
    return list(set(l))

size = int(input("Enter the size of list : "))
user_inputs = []
for i in range(size):
    user_inputs.append(int(input("Enter value : ")))

print("List after duplicaete removed is : ", remove_duplicate(user_inputs))