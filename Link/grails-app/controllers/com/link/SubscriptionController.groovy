package com.link

import com.link.CO.SubscriptionCO
import grails.converters.JSON
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class SubscriptionController {
    SpringSecurityService springSecurityService
    SubscriptionService subscriptionService
    def index() { }

    def subscribe(SubscriptionCO subscriptionCO){
//        String content=g.render([template: '/homepage/unsubscribe'])
//        Map responseData=[content:content]
//        println(params)

        User user=springSecurityService.getCurrentUser()
        def seriousness=params.seriousness
        Topic topic=Topic.findById(params.topicId)

        String result=subscriptionService.create(seriousness,user,topic)
       redirect(controller:"topic",action:"index")

    }
}
