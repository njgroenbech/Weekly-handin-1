package com.example.weeklyhandin1.handin3

class Products(
    val name: String,
    val quantity: Int,
)
{

}

class Inventory(
    val products: MutableList<Products>,
)
{

}