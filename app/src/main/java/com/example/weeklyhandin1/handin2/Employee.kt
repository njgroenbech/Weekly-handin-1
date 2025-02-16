package com.example.weeklyhandin1.handin2

class Employee(
    val firstName: String,
    val lastName: String,
    var monthlySalary: Float
)
{
    init {
        if (monthlySalary < 0.0f) {
            println("Error: salary cannot be lower than 0.")
            monthlySalary = 0.0f
        } else {
            monthlySalary
        }
    }

    fun yearlySalary (): Float {
        return monthlySalary * 12
    }

    fun giveEmployeeRaise (percent: Float): Float {
        monthlySalary *= (1 + percent / 100)
        return yearlySalary()
    }
}