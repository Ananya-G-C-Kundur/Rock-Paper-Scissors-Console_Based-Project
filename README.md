🎮 Rock Paper Scissors – Java Console Game
📌 Project Overview

This project is a console-based Rock Paper Scissors game implemented in Java where a user plays against the computer. The program takes the user's choice, generates a random choice for the computer, and determines the winner based on the classic game rules.

This project demonstrates core Java programming concepts such as user input, conditional logic, random number generation, and method usage.

🎯 Game Rules

The rules of Rock Paper Scissors are simple:

Player Choice	Computer Choice	Result
Rock	Scissors	Rock Wins
Scissors	Paper	Scissors Wins
Paper	Rock	Paper Wins
Same	Same	Draw

The game compares the player's input with the computer's randomly generated choice and declares the winner.

⚙️ How the Program Works
1️⃣ Display Game Menu

The program first displays the available options:

1. Rock
2. Paper
3. Scissors
2️⃣ Take User Input

The program uses the Scanner class to read the user's choice from the console.

The input must be within the range:

1 – 3

If the input is outside this range, the program prints:

Invalid choice
3️⃣ Generate Computer Choice

The computer generates a random number between 1 and 3 using:

Math.random()

The generated number is mapped to a game option:

Number	Choice
1	Rock
2	Paper
3	Scissors
4️⃣ Display Both Choices

The program prints:

Player's choice

Computer's choice

Example output:

The choice Player entered : Rock
The choice Computer entered : Paper
5️⃣ Determine the Winner

The winner is determined using conditional statements (if-else) that check combinations of player and computer choices.

Example logic:

Rock beats Scissors
Scissors beats Paper
Paper beats Rock

If both selections are the same, the result is a Draw.

6️⃣ Play Again Feature

After each round, the program asks:

Want to play again (Y--Yes) or (N--No)

If the player enters Y, the game runs again.

🧠 Concepts Used in This Project
Concept	Description
Java Methods	A separate method is used to generate the computer's random choice.
Scanner Class	Used to read user input from the console.
Random Number Generation	Math.random() generates the computer's move.
Conditional Statements	if-else is used to determine the game outcome.
Method Calls	The randomNumber() method is called from main().
Boolean Logic	Used to validate input range and check winner conditions.
Recursion	The main() method calls itself when the user wants to play again.
User Interaction	Console messages guide the user through the game.
📚 Concepts Learned from This Project

While building this project, the following programming skills were practiced:

✔ Console Input Handling

Understanding how to read and process user input.

✔ Random Number Generation

Learning how to simulate computer decisions using random numbers.

✔ Decision Making in Programs

Using conditional statements to implement real-world logic.

✔ Modular Programming

Separating functionality into methods to make code more organized.

✔ Game Logic Implementation

Designing logic for a simple interactive game.

✔ Program Flow Control

Managing how the program moves from one step to another.

🖥 Example Output
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
🚀 Possible Improvements (Future Enhancements)

This project can be extended in several ways to make it more advanced.

1️⃣ Score Tracking System

Add a scoring system to keep track of:

Player Score
Computer Score

Example:

Player Score: 3
Computer Score: 2
2️⃣ Best of 5 Mode

Instead of playing indefinitely, create a Best of 5 match.

The first to reach 3 wins becomes the final winner.

3️⃣ Input Validation Loop

Instead of ending the program on invalid input, repeatedly ask the user until they enter a valid number.

Example:

Invalid input! Please enter a number between 1 and 3.
4️⃣ Switch Statement Implementation

Replace multiple if-else statements with switch statements for cleaner code.

5️⃣ Graphical User Interface (GUI)

Convert the console game into a GUI application using Java Swing or JavaFX.

Features could include:

Buttons for Rock, Paper, Scissors

Scoreboard display

Game animations

6️⃣ Multiplayer Mode

Allow two players to play against each other instead of playing against the computer.

7️⃣ Game Statistics

Track statistics such as:

Total games played

Player win percentage

Computer win percentage

📂 Project Structure
RockPaperScissors
│
├── RPS.java
└── README.md
🎓 Learning Outcome

This project helps beginners understand how to combine multiple core Java concepts to build a working interactive program. It serves as a foundation for building more complex applications in the future.

👨‍💻 Author

Ananya G C Kundur

Computer Science Engineering Student
Learning Java, Data Structures, and Software Development
