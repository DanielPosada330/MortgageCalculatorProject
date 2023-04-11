# MortgageCalculatorProject

## Purpose
The purpose of the program is to calculate your mortgage monthly payments dependent on the principal, 
annual interest rate, and time period of the loan.

## Language
This program was entirely written in Java.

## Explanation of variables
I had to get creative with the variables as the formula and intended input are different.
I utilizing the following forumla for calculating the mortgage amount 

![image](https://user-images.githubusercontent.com/104124602/231062720-f0f94dc9-13b8-4b1f-8fdf-fb8e3a977ad5.png)


For further clarification: 

![image](https://user-images.githubusercontent.com/104124602/231062419-8b87eb78-71aa-4769-ab25-33a1d272f075.png)

Double principalAmount = Simply having the user input the principal amount of the loan (P)

Float annualInterestRate (AIR) & monthlyInterest (MI) = Getting the user to input the AIR then dividing it by 1200
in order to account for percentage and months together (i)

Float periodYears & periodMonths = Having the user input the time period of the loan in years, then multiplying that by 12 for the periods in months (n).

Double topEquation & bottomEquation = I had to get creative here in order to have the formula written correctly without getting too complicated.
This resulted in separating the equation into two halves.

Double mortgageAmount = I simply multiple the principal amount by the division between top and bottom equations.
Here I could have separated this equation into another varaible to make it easier to read, however this worked for my purposes.
