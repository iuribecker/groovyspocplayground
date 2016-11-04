package com.sachakilinski.poc.springbootgroovyspock

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.sachakilinski.poc.springbootgroovyspock.business.QueryParametersCounter

@RestController
class Controller {

    @Autowired
    private QueryParametersCounter queryParametersCounter

    @RequestMapping("/")
    def hello(@RequestParam Map<String, String> requestParams){
        queryParametersCounter.count(requestParams)
    }
}