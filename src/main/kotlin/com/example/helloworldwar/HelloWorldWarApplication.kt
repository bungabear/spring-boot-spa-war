package com.example.helloworldwar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class HelloWorldWarApplication: SpringBootServletInitializer() {

    override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
        return builder.sources(HelloWorldWarApplication::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<HelloWorldWarApplication>(*args)
}
