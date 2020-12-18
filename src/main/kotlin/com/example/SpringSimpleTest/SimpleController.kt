package com.example.SpringSimpleTest

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("/")
    fun index():String{
        val logger: Logger = LoggerFactory.getLogger("Simple controller")
        logger.info("Uruchmiono stronę index")
        return "index"
    }
}
