package com.example.spawar.config

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest


@Configuration
class WebMvcConfiguration : ErrorViewResolver {
    override fun resolveErrorView(
        request: HttpServletRequest?,
        status: HttpStatus,
        model: Map<String?, Any?>?
    ): ModelAndView? {
        return if (status === HttpStatus.NOT_FOUND) {
            ModelAndView("forward:/")
        } else null
    }
}