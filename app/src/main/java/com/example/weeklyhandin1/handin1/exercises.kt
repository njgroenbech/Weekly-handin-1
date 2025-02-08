package com.example.weeklyhandin1.handin1
import java.util.Scanner

// Kalder funktioner i main function nederst i dokumentet

// 1.
// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
// Let the user input their age.

fun checkAgeForVoting () {
    try {
        val reader = Scanner(System.`in`)
        print("Enter your age: ")

        val ageValue = reader.nextInt()
        println("You assigned your age to be: $ageValue")

        when {
            ageValue > 110 -> println("Are you sure you're not dead?")
            ageValue >= 18 -> println("You are eligible to vote!")
            ageValue < 0 -> println("Error, negative integer.")
            else -> println("You are not eligible to vote.")
        }

    } catch (e: Exception) {
        println("Invalid number, must assign an integer")
        println("Exception: $e")
    }
}

// 2.
// Define two functions to print the maximum and the minimum number respectively among three numbers.

fun getMax (a: Int, b: Int, c: Int): Int {
    return when {
        a >= b && a >= c ->  a
        b >= a && b >= c -> b
        else -> c
    }
}

fun getMin (a: Int, b: Int, c: Int): Int {
    return when {
        a <= b && a <= c ->  a
        b <= a && b <= c -> b
        else -> c
    }
}

// 3.
// Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.

fun calculateAverage (list: List<Int>): Double {
        val sum = list.sum()
        val average = sum.toDouble() / list.size
        return average
}

// 4.
// Write a method that returns if a user has input a valid CPR number.
// A valid CPR number has:

// 10 Digits.
// The first 2 digits are not above 31.
// The middle 2 digits are not above 12.

// The method returns true if the CPR number is valid, false if it is not.

fun checkIfValidCPRNumber (cpr: String): Boolean {

    // return false if cpr is longer than 10 digits and if string doesn't include only digits
    if (cpr.length != 10 || !cpr.all { char -> char.isDigit()}) {
        return false
    }

    val day = cpr.substring(0, 2).toInt() // grab first two digits and convert to Int
    val month = cpr.substring(2, 4).toInt() // grab 3rd and 4th digits and convert to Int

    // return if day and month are valid
    return day <= 31 && month <= 12
}

// 5.
// Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
// instead of the number and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”

fun printFizzBuzz () {
    for (number in 1..100) {
        when {
            // first check for divisibles of both 3 and 5, as the loop will never reach these cases
            // when both are divisible by 3 and 5, as it will print either fizz or buzz in the order
            // of when expression
            number % 5 == 0 && number % 3 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)
        }
    }
}

// 6.
// Write a program that takes your full name as input and displays the abbreviations of the
// first and middle names except the last name which is displayed as it is.

// For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
// Or Benjamin Dalsgaard Hughes will be B.D. Hughes

fun abbreviateName (first: String, mid: String, last: String): String {
    // abbreviate first name
    val abFirst = "${first[0]}. "

    // if middle name is empty, only return first and last
        if (mid.isEmpty()) {
            return abFirst + last
        } else {
            val abMid = "${mid[0]}. " // if middle isn't empty, abbreviate middle
            return abFirst + abMid + last
        }
}

// Opg. 7
// Write a program that takes a numerical grade (0-100) as input and prints out the corresponding
// american letter grade.
// Implement a function calculateGrade that takes an integer parameter representing the grade and
// returns a string representing the letter grade according to the following scale:

// 90-100: "A"

//80-89: "B"

//70-79: "C"

//60-69: "D"

//Below 60: "F"

fun calculateGrade (grade: Int): String {
    return when (grade) {
        in 90..100 -> "Grade is A"
        in 80..89 -> "Grade is B"
        in 70..79 -> "Grade is C"
        in 60..69 -> "Grade is D"
        else -> "Grade is F"
    }
}

// Opg. 8
// Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum -
// length, and returns a list containing only the words that have a length greater than or equal -
// to the specified minimum length.

fun filterWordsByLength (list: List<String>, minLength: Int): List<String> {
    return list.filter { it.length >= minLength }
}

// Opg. 9
// ISBN Validator program

fun validateISBN (isbn: String): Boolean {
    val length = isbn.length
    if (length != 10) { // check if string is 10 characters long
        return false
    }
    val filterHyphens = isbn.replace("-", "")

    var sum = 0 // variable to divide and return

    // check first 9 indices to calculate
    for (i in 0 until 9) {
        val digit = filterHyphens[i].digitToInt()
        if (digit !in 0..9) {
            return false
        }

        // since formula starts starts by multiplying by 10 and decreases by 1 for the next nr.,
        // we can multiply the digit by 10, minus the current index
        sum += (digit * (10 - i))
    }

    // check last index to calculate (also if it is X)
    val lastCharacter = filterHyphens[9]
    if (lastCharacter == 'X') {
        sum += 10
    } else if (lastCharacter.isDigit()) {
        val digit = lastCharacter.digitToInt()
        sum += digit
    } else {
        return false
    }

    // finally, check if the remainder is 0 after dividing by 11. Remainders of 0 will return true,
    // meaning the isbn is valid
    return sum % 11 == 0
}

fun main () {
    // Opg. 1
    checkAgeForVoting()

    // Opg. 2
    val max: Int = getMax(1, 4, 6)
    val min: Int = getMin(24, 100, -30)
    println(max)
    println(min)

    // Opg. 3
    val list = listOf(2240, 2590, 1249809)
    val listToCalculate = calculateAverage(list)
    println(listToCalculate)

    // Opg. 4
    val cpr = "1603954903"
    val validateCPR = checkIfValidCPRNumber(cpr)
    println(validateCPR)

    // Opg. 5
    printFizzBuzz()

    // Opg. 6
    val reader = Scanner(System.`in`)
    println("Enter your first name, middle name (if you have one) and last name to abbreviate: ")

    val firstName = reader.next()
    println("You assigned your first name to be: $firstName")

    reader.nextLine() // handle buffer from first name, as middle will be consumed otherwise

    val midName = reader.nextLine().trim() // Use nextLine to allow for middle name to be empty
    println("You assigned your middle name to be: $midName")

    val lastName = reader.next()
    println("You assigned your last name to be: $lastName")

    val name = abbreviateName(firstName, midName, lastName)
    println("Your abbreviated name is: $name")

    // Opg. 7
    val grade = calculateGrade(93)
    println(grade)

    // Opg. 8
    val wordsList = listOf("asdas", "aswd", "ASfasfas", "adsdasdawd")
    val filterResult = filterWordsByLength(wordsList, 5)
    println(filterResult)

    // Opg. 9
    val isbnValue = "1112223339"
    val isbnToPrint = validateISBN(isbnValue)
    println(isbnToPrint)
}