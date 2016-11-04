package com.sachakilinski.poc.springbootgroovyspock.business

import org.springframework.stereotype.Service

@Service
class QueryParametersCounter {
    def count(Map<String, String> requestParams){
        requestParams.entrySet().size()
    }
}
