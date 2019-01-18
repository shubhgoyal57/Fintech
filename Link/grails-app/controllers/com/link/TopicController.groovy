package com.link

import com.link.CO.TopicCO
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class TopicController {
    TopicService topicService
    SpringSecurityService springSecurityService

    def index() {
        User user=springSecurityService.getCurrentUser()
        int topicCount=Topic.countByCreatedBy(user)
        int subcriptionCount=Subscription.countByUser(user)
        List list = Topic.getAll()
        def topicSubscribed=Subscription.findAllByUser(user)
        List topicCreatedByUser=Topic.findAllByCreatedBy(user)
        render(view: "/homepage/home", model: [topicSubscribed:topicSubscribed,topicCreatedByUser:topicCreatedByUser,topics: list,topicCount:topicCount,subcriptionCount:subcriptionCount,user:user])
    }

    def createTopic(TopicCO topicCO) {
        User createdBy = springSecurityService.getCurrentUser()

        String s = topicService.create(topicCO, createdBy)
        redirect(controller:"topic",action:"index")
    }
}
