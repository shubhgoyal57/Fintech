package com.link.CO

import com.link.ENUMS.Visibility
import com.link.Topic

import grails.validation.Validateable

class TopicCO implements Validateable {
    String name


    Visibility visibility
    static constraints={
        importFrom(Topic)

    }
}
