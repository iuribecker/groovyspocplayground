package com.sachakilinski.poc.springbootgroovyspock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class Main {
    static void main(String[] args) {
        new SpringApplicationBuilder().sources(this).run()
    }
}
