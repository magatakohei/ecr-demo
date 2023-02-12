package com.example.ecrdemo.controller

import com.example.ecrdemo.entity.GreetingResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class GreetingController {
    @GetMapping("/greeting/{name}")
    fun greeting(@PathVariable name: String) = GreetingResponse(
        datetime = LocalDateTime.now(),
        message = "GoodMorning, $name!"
    )
}
