package com.example.weeklyhandin1.handin2

abstract class Product(
    val name: String,
    var price: Float,
    var quantity: Int
)
{
    override fun toString (): String {
        return "Name: $name, Price: $price, Quantity: $quantity"
    }
    open fun identifyProductCategory (): String {
        return "Product name: $name, product price: $price, product quantity: $quantity"
    }
}

class Shoe (
    name: String,
    price: Float,
    quantity: Int
): Product(name, price, quantity)
{
    override fun identifyProductCategory(): String {
        return "I am a shoe"
    }
}

class Tshirt (
    name: String,
    price: Float,
    quantity: Int
): Product(name, price, quantity)
{
    override fun identifyProductCategory(): String {
        return "I am a T-shirt"
    }
}

class Book (
    name: String,
    price: Float,
    quantity: Int
): Product(name, price, quantity)
{
    override fun identifyProductCategory(): String {
        return "I am a book"
    }
}