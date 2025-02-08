package com.example.weeklyhandin1.handin2

open class Computer(
    val brand: String,
    val processor: String,
    var isOn: Boolean
)
{
    open override fun toString (): String {
        return "Brand: $brand, processor: $processor, is on: $isOn"
    }

    open fun powerOn () {
        println("Device is now powered on")
        isOn = true
    }

    open fun powerOff () {
        println("Device is now powered off")
        isOn = false
    }
}

class Laptop(
    brand: String,
    processor: String,
    isOn: Boolean,
    var cameraIsOn: Boolean
): Computer(brand, processor, isOn)
{
    fun turnCameraOn () {
        println("Camera is now turned on")
        cameraIsOn = true
    }

    fun turnCameraOff () {
        println("Camera is now turned off")
        cameraIsOn = false
    }

    override fun toString (): String {
        return "Laptop details - " + super.toString() + ", camera is on: $cameraIsOn"
    }
}

class SmartPhone(
    brand: String,
    processor: String,
    isOn: Boolean,
    var batteryLife: Int
): Computer(brand, processor, isOn)
{
    init {
        if (batteryLife !in 0..100) {
            println("Error: battery life should be between 0-100. Setting battery life to 0.")
            batteryLife = 0
        }
    }

    fun checkBatteryLife () {
        println("Battery life is at $batteryLife percent.")
    }

    override fun toString (): String {
        return "Details of Smartphone - " + super.toString() + ", battery life: $batteryLife"
    }
}