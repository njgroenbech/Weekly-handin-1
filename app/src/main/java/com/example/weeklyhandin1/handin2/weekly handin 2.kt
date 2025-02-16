package com.example.weeklyhandin1.handin2

// 1.
// Create a class called Employee that includes three pieces of information as instance variables
// A first name

// A last name

// A monthly salary

// Your class should have a constructor that initializes the three instance variables.
// If the monthly salary is not positive, set it to 0.0.
// Create two Employee objects and display each object’s yearly salary.
// Then give each Employee a 10% raise and display each Employee’



// 2.
// Create a new class called Computer. Before you add any more code, know that you will need
// to add two additional classes: Laptop and SmartPhone

// For a parent class add 3 properties, 2 methods, and a constructor.
// For a child class add at least 1 additional property and 1 additional method.
// In the main method create a Laptop and a SmartPhone

// 3.
// Create a base class Product with attributes like name, price, and quantity and a function
// identifyProductCategory. Subclass it to create specific product types like Shoe, T-shirt, and Book.
// Override the function such that:

// The shoe outputs "I am a shoe" .
// The T-shirt outputs "I am a T-shirt"
// The book outputs "I am a book"


fun main () {
    // Opg 1
    val employee1 = Employee("John", "Doe", 1000.0f)
    val johnYearlySalary = employee1.yearlySalary()
    println("John's yearly salary is: $johnYearlySalary")

    println("---")

    val employee2 = Employee("Jane", "Doe", 2000.0f)
    val janeYearlySalary = employee2.yearlySalary()
    println("Jane's yearly salary is: $janeYearlySalary")

    println("---")

    val giveJohnRaise = employee1.giveEmployeeRaise(10.0f)
    println("John's raised yearly salary is: $giveJohnRaise")

    println("---")

    val giveJaneRaise = employee2.giveEmployeeRaise(10.0f)
    println("Jane's raised yearly salary is: $giveJaneRaise")
    println("---")
    println("---")
    println("---")

    // Opg 2
    val computer = Computer("Lenovo", "Intel", true)
    computer.powerOff()
    println("---")
    println(computer)
    println("---")

    val laptop = Laptop("Apple", "AMD", true, true)
    laptop.powerOff()
    println("---")
    laptop.turnCameraOff()
    println("---")
    println(laptop)
    println("---")

    val smartphone = SmartPhone("Samsung", "Snapdragon", false, 120)
    smartphone.checkBatteryLife()
    println("---")
    println(smartphone)
    println("---")
    smartphone.powerOn()
    println("---")

    val computer3 = Computer("asd", "asd", true)
    println(computer3)

    // Opg 3
    val shoe = Shoe("Converse", 49.99f, 30)
    val identifyShoe = shoe.identifyProductCategory()
    println(identifyShoe)
    println("---")
    println(shoe)
    println("---")

    val tshirt = Tshirt("Cool shirt", 99.99f, 50)
    val identifyTShirt = tshirt.identifyProductCategory()
    println(identifyTShirt)
    println("---")
    println(tshirt)
    println("---")

    val book = Book("Percy Jackson", 39.99f, 400)
    val identifyBook = book.identifyProductCategory()
    println(identifyBook)
    println("---")
    println(book)
    println("---")

    // Opg 4
    // Junior developer solution (deepseek)
    val triangle = Triangle("Red", false, 30.0, 40.0, 50.0)
    val triangleArea = triangle.calculateArea()
    val trianglePerimeter = triangle.calculatePerimeter()
    println(triangleArea)
    println("---")
    println(trianglePerimeter)
    println("---")

    val circle = Circle("Blue", true, 23.0)
    val circleArea = circle.calculateArea()
    val circlePerimeter = circle.calculatePerimeter()
    println(circleArea)
    println("---")
    println(circlePerimeter)

    // This solution doesn't provide error handling, for example when a triangles sides
    // a + b > c && a + c > b && b + c > a doesn't fulfill these requirements, NaN is returned
    // when trying to calculate the Area of the triangle.
    // There should also be an error check in the circle calculations, where the radius of the
    // circle must be > 0, as a circle's radius cannot be lower than or equal to 0.
    // The properties and values in the constructor should also be separated into their own lines,
    // as the code is very hard to read right now.

    // These are issues that the senior developer solved.

}