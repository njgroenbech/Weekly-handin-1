package com.example.weeklyhandin1.handin3

interface FastFood {
    fun prepMeal (): String
    fun serveMeal (): String
}

abstract class FoodBase(
    val name: String,
    var ingredients: String,
    var price: Float,
)
{
    init {
        if (price < 0.0f) {
            println("Price of $name cannot be lower than 0. Setting price to 0.")
            price = 0.0f
        } else {
            price
        }
    }
    override fun toString (): String {
        return "Name: $name, ingredients: $ingredients, price: $price"
    }
}

class Sandwich(
    name: String,
    ingredients: String,
    price: Float,
    val isVegan: Boolean
): FoodBase(name, ingredients, price), FastFood
{
    override fun prepMeal (): String {
        return "$name is being prepared with ingredients: $ingredients!"
    }

    override fun serveMeal (): String {
        return "$name is ready to be served!"
    }
}

class Pizza(
    name: String,
    ingredients: String,
    price: Float,
    val isNonDairy: Boolean
): FoodBase(name, ingredients, price), FastFood
{
    override fun prepMeal (): String {
        return "$name is being prepared with ingredients: $ingredients!"
    }

    override fun serveMeal (): String {
        return "$name is ready to be served!"
    }
}

class Kebab(
    name: String,
    ingredients: String,
    price: Float,
    val isHalal: Boolean
): FoodBase(name, ingredients, price), FastFood
{
    override fun prepMeal (): String {
        return "$name is being prepared with ingredients: $ingredients!"
    }

    override fun serveMeal (): String {
        return "$name is ready to be served!"
    }
}



