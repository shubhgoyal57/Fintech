package com.link

import com.link.CO.TopicCO
import grails.gorm.transactions.Transactional

@Transactional
class TopicService {

    def serviceMethod() {

    }

    def create(TopicCO topicCO, User createdBy) {

        Topic topic = new Topic(topicCO, createdBy)
        if (!topic.save(flush: true)) {
            topic.errors.allErrors.each {
                println(it)
            }
        }
        return "topic created"

    }

    def update() {

    }

    def read() {

    }

    def delete() {

    }
}
