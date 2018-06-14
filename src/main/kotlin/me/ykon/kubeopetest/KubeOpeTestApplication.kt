package me.ykon.kubeopetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubeOpeTestApplication

fun main(args: Array<String>) {
    runApplication<KubeOpeTestApplication>(*args)
}
