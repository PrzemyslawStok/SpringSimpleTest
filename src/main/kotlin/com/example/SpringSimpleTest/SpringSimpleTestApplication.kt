package com.example.SpringSimpleTest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringSimpleTestApplication

fun main(args: Array<String>) {
	runApplication<SpringSimpleTestApplication>(*args)
}
