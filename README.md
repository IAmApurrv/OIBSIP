# Online Reservation System

This is a simple console-based online reservation system implemented in Java.

## Overview

This program allows users to log in, make reservations for train journeys, and cancel existing reservations. It maintains a database of users and their reservations.

## Usage

1. **Compilation**: Compile the Java file `OnlineReservationSystem.java` using a Java compiler:

    ```bash
    javac OnlineReservationSystem.java
    ```

2. **Execution**: Run the compiled class file:

    ```bash
    java OnlineReservationSystem
    ```

3. **Login**: Upon running the program, you'll be prompted to enter a username and password. Sample user credentials are provided in the code.

4. **Menu Options**: After successful login, you'll be presented with a menu offering the following options:
    - **Make Reservation**: Allows users to book a train ticket by providing necessary details.
    - **Cancel Reservation**: Enables users to cancel an existing reservation by entering the PNR number.
    - **Exit**: Exit the program.

## Sample Input

- **Login**:
    ```
    Enter username:
    Apurrv
    Enter password:
    apurrv
    ```

- **Make Reservation**:
    ```
    1. Make Reservation
    2. Cancel Reservation
    3. Exit
    Enter your choice:
    1

    Enter your name:
    Apurrv
    Enter train number:
    12116
    Enter class type:
    First Class
    Enter date of journey:
    2024-03-20
    Enter from (place):
    Solapur
    Enter to (destination):
    Mumbai CSMT
    ```

- **Cancel Reservation**:
    ```
    1. Make Reservation
    2. Cancel Reservation
    3. Exit
    Enter your choice:
    2

    Enter your PNR number:
    PNR1
    Press OK to confirm cancellation.
    OK
    ```





# Number Guessing Game

This Java program implements a simple number guessing game where the player has to guess a randomly selected number within a specified range.

## How to Play

1. Run the program.
2. The program will generate a random number between 1 and 100.
3. You will have a maximum of 10 attempts to guess the number correctly.
4. After each guess, the program will provide feedback if the guess is too low or too high.
5. Your score decreases by 10 points after each incorrect guess.
6. If you guess the number correctly within the allowed attempts, you win. Otherwise, you lose.

## Sample Input

Here's an example of how you can play the game:

```
Welcome to Guess the Number game!
I've selected a random number between 1 and 100. Guess it!
Enter your guess: 50
Too low! Try again.
Enter your guess: 75
Too high! Try again.
Enter your guess: 60
Too low! Try again.
Enter your guess: 70
Too high! Try again.
Enter your guess: 65
Congratulations! You guessed the number!
Your score: 50
```

## Additional Information

- The program uses `Scanner` to take user input and `Random` to generate a random number.
- The lower bound of the range is inclusive, while the upper bound is exclusive.
- The initial score is 100, and it decreases by 10 after each incorrect guess.
- If the maximum number of attempts is reached without guessing the correct number, the game ends, and the correct number is revealed.









# ATM System

This is a simple ATM system implemented in Java, allowing users to perform basic banking operations such as deposit, withdrawal, transfer, and view transaction history.

## Usage

1. Compile the Java code:

   ```bash
   javac ATMInterface.java
   ```

2. Run the compiled program:

   ```bash
   java ATMInterface
   ```

3. Follow the prompts to interact with the ATM system.

## Sample Input

Upon running the program, you will be prompted to enter your User ID and PIN:

```
Welcome to ATM
Enter User ID: user123
Enter PIN: 1234
```

Once logged in successfully, you can choose from the following options:

```
Choose an option:
1. Transactions History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
```

Here's a sample interaction demonstrating depositing, withdrawing, transferring, and viewing transaction history:

```
Enter your choice: 3
Enter amount to deposit: RS 500
Deposited: RS 500

Enter your choice: 2
Enter amount to withdraw: RS 200
Withdrawn: RS 200

Enter your choice: 4
Enter amount to transfer: RS 100
Transferred: RS 100

Enter your choice: 1
=================================================

Transaction History:
Deposit: RS 500
Withdrawal: RS 200
Transfer: RS 100

Enter your choice: 5
Thank you for using the ATM
```