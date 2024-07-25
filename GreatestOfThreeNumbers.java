1. Write a program that calculates the commission earned by a salesperson based on their sales amount and commission rate. Accept the sales amount form the user and calculate commission earned by sales person based on commission rate. Refer below table for different commission rates:
    | Sales Amount     	| Commission Rate %	|
    |------------------	|-----------------	|
    | 1 to 10000       	|        3          |
    | 10001 to 25000   	|        8        	|
    | 25001 to 50000   	|        15       	|
    | 50001 to 100000  	|        25       	|
    | 100001 and above 	|        35       	|
    ```
        Sample Run 1:
        Enter Sales amount 24000
        Based on sales amount, commission eraned = 1920
        Sample Run 2:
        Enter Sales amount 300000
        Based on sales amount, commission eraned = 105000
    ```
2. Write a program that checks if a given year is a leap year. Print "Leap Year" or "Not a Leap Year". 

    ``` 
    Hint:
    A year is a leap year if it is divisible by 4 but not by 100, if it is divisible by 100, then it must be divisible by 400 to be a leap year.
    ```
    ```
    Sample Run 1:
    Enter year: 1996
    It's a leap year
    Sample Run 2:
    Enter year: 2000
    It's a leap year
    Sample Run 3:
    Enter year: 1900
    It's not a leap year
    ```
3. Write a program that reads an integer and prints:

    - "Divisible by 2 and 3" if the number is divisible by both 2 and 3,
    - "Divisible by 2 but not 3" if the number is divisible by 2 but not 3,
    - "Divisible by 3 but not 2" if the number is divisible by 3 but not 2,
    - "Not divisible by 2 or 3" if the number is not divisible by either.

4. Create a program that reads the current hour (0-23) and prints:

    - "Good Morning" for hours between 5 and 11,
    - "Good Afternoon" for hours between 12 and 17,
    - "Good Evening" for hours between 18 and 21,
    - "Good Night" for hours between 22 and 4.




1. Write a program that prompts the user to enter the speed of a vehicle. If speed is less than 20, display too slow; if speed is greater than 80, display too fast; but alwyas display drive safe.
2. Write a program that prompts the user to enter the total_bil_amount. If bill amount greater than or equal to 2000, calculate and print the final_bill_amount by giving 10 percent discount. If bill amount is less than 2000 then print No Discount.
3. Write a program that reads three edges of a triangle and computes and display the area if the input is valid. Otherwise, it displays that the input is invalid. The input is valid if all the edges of the triangle are equal.Formula for calculating area:
    ```
    Area = 0.433012 * edge * edge
    ```
4. Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Indian Rupee. Prompt the user to enter 0 to convert from U.S. dollars to Indian Rupee and 1 to convert from Indian Rupee and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Indian Rupee to convert it to Indian Rupee or U.S. dollars, respectively. Here are the sample runs:
    ```
    Enter the exchange rate from dollars to Indian Rupee: 83.61
    Enter 0 to convert dollars to Indian Rupee and 1 vice versa: 0
    Enter the dollar amount: 100
    $100 is  8361 INR
    ```
    ```
    Enter the exchange rate from dollars to Indian Rupee: 83.61
    Enter 0 to convert dollars to Indian Rupee and 1 vice versa: 1
    Enter the INR amount: 1000
    1000 INR is 11.96 USD


6. Write a program that calculates the energy needed to
heat water from an initial temperature to a final temperature. Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water.
    >The formula to compute the energy is
    >Q = M * (finalTemperature – initialTemperature) * 4184
    >where M is the weight of water in kilograms temperatures are in degrees Celsius, and energy Q is measured in joules. 
    
    Here is a sample run:
    
    ![sample run](./resources/q6.jpg)
7. If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
    >interest = balance x (annualInterestRate/1200)
    Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
8. Ravi and Shyam were playing a game. In the first turn of the game, Ravi will give an integer dividend and an integer divisor to Shyam. Then Shyam has to tell him the remainder of the division. In the second turn, Shyam will repeat the procedure. 
    To help them, please write a program that accepts Dividend, and Divisor from the user and print the remainder on the console.
    ![hint](./resources/q8.jpg)
0 comments on commit c7fe6fd
