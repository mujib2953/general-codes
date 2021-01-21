# Author: Mujib Ansari
# Dat: Jan 21, 2021

# Problem Statement: WAP to find give year is leap-year or not

def is_leap_year(year):
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                print(year, "is LEAP YEAR")
            else:
                print(year, "is NOT LEAP YEAR")
        else:
            print(year, "is LEAP YEAR")
    else:
        print(year, "is NOT LEAP YEAR")

is_leap_year(int(input("Please enter year : ")))
