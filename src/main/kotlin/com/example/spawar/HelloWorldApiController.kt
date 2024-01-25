package com.example.spawar

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloWorldApiController {

    @GetMapping("/api")
    fun getRoot(): String {
        return "Hello"
    }

}