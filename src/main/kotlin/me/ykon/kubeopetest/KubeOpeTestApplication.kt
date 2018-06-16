package me.ykon.kubeopetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class KubeOpeTestApplication

fun main(args: Array<String>) {
    runApplication<KubeOpeTestApplication>(*args)
}
