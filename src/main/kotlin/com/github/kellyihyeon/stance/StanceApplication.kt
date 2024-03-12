package com.github.kellyihyeon.stance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StanceApplication

fun main(args: Array<String>) {
    runApplication<StanceApplication>(*args)
}
