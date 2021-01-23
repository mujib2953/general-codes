# Author: Mujib Ansari
# Date: Jan 23, 2021

# Problem Statement: WAP to calculate number of days we lived.

from datetime import date

dob = input("Please enter your dob (DD-MM-YYYY) e.g 25-12-1990: ")
dob = list(map(lambda x: int(x), dob.split("-")))
dob = date(dob[2], dob[1], dob[0])
_today = date.today()
print("User has entered : ", dob)

days_user_lived = _today - dob
print("User has lived : ", days_user_lived)
