# Title
Multiples

# Description
The program should iterate and return three results. First result is the multiples of A until X, second result is the multiples of A + 1 until 2X 
and final result is the multiples of A + 2 until 3X.

# Components

### Class "Calculate"
To improve readability and keep the main class clean the program uses a class which accommodates the necessary methods. 

### Method "formula"
The method "formula" uses a recurrence relation to find the multiples of a given number until it reaches a condition.
Since the mathematical formula to calculate the multiples in every instance is the same, using a method to store the 
formula and then reuse it as necessary helps with keeping the code organized and easier to maintain by avoiding repetitive lines.

### Method "calculateMultiples"
The method "calculate" is used to declare the initial values, update them before it moves to the next loop and display the results.
The method accepts two values: the number A which passes it to the method "formula" which in return calculates the multiples 
and a destination number X which is used as the condition to end the program. 

### JUnit Testing
The program utilises the JUnit framework to test that the methods work as expected. 
![junit](https://user-images.githubusercontent.com/61947811/163426269-b807709e-6f80-4051-9b6e-6f00c38b5e07.png)

