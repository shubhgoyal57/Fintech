package com.link

import com.link.CO.DocumentResourceCO
import com.link.CO.SubscriptionCO
import grails.gorm.transactions.Transactional

@Transactional
class SubscriptionService {

    def serviceMethod() {

    }
    def create(def seriousness,User user,Topic topic){

        def c=Subscription.createCriteria()
        def result=c.list{
            eq("topic",topic)
            eq("user",user)
        }

        if(result.size()==0)
        {
            Subscription subscription=new Subscription(seriousness,user,topic)
            if (!subscription.save(flush: true)) {
                subscription.errors.allErrors.each {
                    println(it)
                }
            }
            return "subscribed"
        }
        else{
            Subscription.load(id: topic).delete()
        }

        return "not subscribed"
    }

    def read() {

    }

    def update() {

    }

    def delete() {

    }
}
