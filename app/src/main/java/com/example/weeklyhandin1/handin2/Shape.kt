package com.example.weeklyhandin1.handin2
import kotlin.math.sqrt

abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(color: String, isTransparent: Boolean, private val radius: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Triangle(color: String, isTransparent: Boolean, private val a: Double, private val b: Double, private val c: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return a + b + c
    }

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}