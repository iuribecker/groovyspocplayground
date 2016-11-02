package com.sachakilinski.poc.springbootgroovyspock

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @RequestMapping("/")
    def hello(){
        'hello'
    }
}
