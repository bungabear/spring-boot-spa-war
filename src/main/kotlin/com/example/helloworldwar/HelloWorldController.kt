package com.example.helloworldwar

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RestController("/")
class HelloWorldController {

    @GetMapping("")
    fun getRoot(): String {
        return "Hello"
    }

}