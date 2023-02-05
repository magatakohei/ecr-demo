package com.example.ecrdemo.entity

import java.time.LocalDateTime

data class GreetingResponse(
    val datetime: LocalDateTime,
    val message: String,
)