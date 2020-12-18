package com.example.SpringSimpleTest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("/")
    fun index() = "index"
}
