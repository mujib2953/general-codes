# Author: Mujib Ansari
# Date: Jan 21, 2021

# Problem Statement: WAP to reverse a string using function

def reverse_string(s):
    str = ""
    for i in s:
        str = i + str

    return str

s = "Arigato"
print("Original string : ", s)
print("Reverse string : ", reverse_string(s))
