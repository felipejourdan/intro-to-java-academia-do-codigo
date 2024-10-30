Instructions

You’ve got five different exercises to complete.

For each exercise, you will need to create a separate .java file. In each file, declare a public class with exactly the same file name. Inside each class, declare the main() method.

While working on the exercises, run your programs several times to test your code.

If you are using Vim:

Recall the terminal command to compile a Java program:

$ javac <FileName>.java
And to execute a Java program:

$ java <FileName>
or use IntelliJ which will automatically compile the code and where you can hit the play on the main() method to run it.

Exercise 1: String Manipulation

Using Vim, create a file named StringManipulation.java.

Search inside the string str for the necessary characters to assign a value to the given variables and print the message I am a Learner at <Code for All_>, codeforall.com. You can type missing symbols, like >, <, _.

String str = "check in on us at: https://codeforall.com";

String domain = ""; // codeforall.com
String name = "";   // <Code for All_>
To create the message that is going to be printed, you don’t need to pick the characters from str. You can write most of it, but leave the domain and name parts to the variables.

Exercise 2: Regex Replacer

Using Vim, create a file named RegexReplacer.java.

Replace all the vowels in a string with the character #.

Example:

Input: Peter Piper picked a peck of pickled peppers.
Output: P#t#r P#p#r p#ck#d # p#ck #f p#ckl#d p#pp#rs.


Exercise 3: Leap Year Verifier

Using Vim, create a file named LeapYearVerifier.java.

Verify if each year present on the array below is a leap year.

int[] years = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 1900, 2100, 2200, 2300, 2400, 2500, 2600, 2700, 2800, 2900, 3000};
To check if a year is a leap year, divide the year by 4. If it is fully divisible by 4, it is a leap year. For example, the year 2016 is divisible by 4, so it is a leap year, whereas 2015 is not. However, century years, like 300, 700, 1900, and 2000, need to be divisible by 400 to check whether they are leap years or not.
Expected Output:

2000 is a leap year
2004 is a leap year
2008 is a leap year
2012 is a leap year
2016 is a leap year
2020 is a leap year
2024 is a leap year
2028 is a leap year
2032 is a leap year
2036 is a leap year
2040 is a leap year
2044 is a leap year
2048 is a leap year
1900 is not a leap year
2100 is not a leap year
2200 is not a leap year
2300 is not a leap year
2400 is a leap year
2500 is not a leap year
2600 is not a leap year
2700 is not a leap year
2800 is a leap year
2900 is not a leap year
3000 is not a leap year


Exercise 4: Closest Neighbours

Using Vim, create a file named ClosestNeighbours.java.

For any given array of integers, create a program that prints two neighbouring numbers with the smallest difference.

For the array int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};, the two neighbouring numbers you are looking for are 111 and 112.

Hint: remember Math.abs();.

Exercise 5: Anagram Checker

Using Vim, create a file named AnagramChecker.java.

Write a program that checks if two strings are an anagram of each other. It should print true if they are, and false if they are not.

You can check the definition of an anagram here.
Examples of anagrams:

"silent" and "listen"

"The Morse Code" and "Here come dots"

"O DRACONIAN DEVIL! OH LAME SAINT" and "Leonardo Da Vinci! The Mona Lisa"

