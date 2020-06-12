package com.example.databinding

import java.util.*

class FakeRepository {
    private val names = listOf("Monica", "Tom", "Isabell", "Cody", "Zac", "Fiona", "Shrek", "Lory")

    fun getRandomName(): String {
        return names[Random().nextInt(names.size)]
    }
}