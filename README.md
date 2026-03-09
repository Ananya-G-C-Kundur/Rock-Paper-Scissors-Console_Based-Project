# 🎮 Rock Paper Scissors -- Java Console Game

## 📌 Project Overview

This project is a **console-based Rock Paper Scissors game implemented
in Java** where a user plays against the computer. The program takes the
user's choice, generates a random choice for the computer, and
determines the winner based on the classic game rules.

This project demonstrates **core Java programming concepts** such as: -
User input handling - Conditional logic - Random number generation -
Method usage - Basic game logic implementation

------------------------------------------------------------------------

# 🎯 Game Rules

  Player Choice   Computer Choice   Result
  --------------- ----------------- ---------------
  Rock            Scissors          Rock Wins
  Scissors        Paper             Scissors Wins
  Paper           Rock              Paper Wins
  Same            Same              Draw

The game compares the **player's input with the computer's randomly
generated choice** and declares the winner.

------------------------------------------------------------------------

# ⚙️ How the Program Works

## 1️⃣ Display Game Menu

The program first displays the available options:

1.  Rock\
2.  Paper\
3.  Scissors

------------------------------------------------------------------------

## 2️⃣ Take User Input

The program uses the **Scanner class** to read the user's choice from
the console.

The input must be within the range:

`1 – 3`

If the input is outside this range, the program prints:

`Invalid choice`

------------------------------------------------------------------------

## 3️⃣ Generate Computer Choice

The computer generates a random number between **1 and 3** using:

`Math.random()`

The generated number is mapped to a game option:

  Number   Choice
  -------- ----------
  1        Rock
  2        Paper
  3        Scissors

------------------------------------------------------------------------

## 4️⃣ Display Both Choices

Example output:

    The choice Player entered : Rock
    The choice Computer entered : Paper

------------------------------------------------------------------------

## 5️⃣ Determine the Winner

The winner is determined using **conditional statements (`if-else`)**.

Game logic:

-   Rock beats Scissors\
-   Scissors beats Paper\
-   Paper beats Rock

If both selections are the same, the result is a **Draw**.

------------------------------------------------------------------------

## 6️⃣ Play Again Feature

After each round, the program asks:

`Want to play again (Y--Yes) or (N--No)`

If the player enters **Y**, the game runs again.

------------------------------------------------------------------------

# 🧠 Concepts Used in This Project

  Concept                    Description
  -------------------------- ------------------------------------------------------
  Java Methods               Method used to generate the computer's random choice
  Scanner Class              Used to read user input
  Random Number Generation   `Math.random()` generates computer move
  Conditional Statements     `if-else` determines winner
  Method Calls               `randomNumber()` method called from `main()`
  Boolean Logic              Used to validate input range
  Recursion                  `main()` method calls itself for replay
  User Interaction           Console messages guide user

------------------------------------------------------------------------

# 📚 Concepts Learned

✔ Console Input Handling\
✔ Random Number Generation\
✔ Decision Making using Conditional Statements\
✔ Modular Programming using Methods\
✔ Implementing Game Logic\
✔ Program Flow Control

------------------------------------------------------------------------

# 🖥 Example Output

    Welcome to Rock Paper Scissors

    1. Rock
    2. Paper
    3. Scissors

    Enter your choice: 1

    The choice Player entered:
    Rock

    The choice Computer entered:
    Scissors

    Player Win! (Rock Win)

    Want to play again (Y--Yes) or (N--No):

------------------------------------------------------------------------

# 🚀 Future Enhancements

### 1️⃣ Score Tracking System

Track player and computer scores.

Example:

    Player Score: 3
    Computer Score: 2

### 2️⃣ Best of 5 Mode

Game ends when a player wins **3 out of 5 rounds**.

### 3️⃣ Input Validation Loop

Ask for input again if the user enters an invalid number.

### 4️⃣ Switch Statement Implementation

Replace `if-else` with `switch` for cleaner code.

### 5️⃣ GUI Version

Create a graphical version using **Java Swing or JavaFX**.

### 6️⃣ Multiplayer Mode

Allow **two players to play**.

### 7️⃣ Game Statistics

Track: - Total games played - Player win percentage - Computer win
percentage

------------------------------------------------------------------------

# 📂 Project Structure

    RockPaperScissors
    │
    ├── RPS.java
    └── README.md

------------------------------------------------------------------------

# 🎓 Learning Outcome

This project demonstrates how **multiple core Java concepts can be
combined to build an interactive console application**.

------------------------------------------------------------------------

# 👨‍💻 Author

**Ananya G C Kundur**\
Computer Science Engineering Student\
Learning **Java, Data Structures, and Software Development**
