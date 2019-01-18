package com.link.CO

import com.link.ENUMS.Seriousness
import com.link.Subscription
import com.link.Topic
import grails.validation.Validateable

class SubscriptionCO implements Validateable {
    Seriousness seriousness


    static constraints={
        importFrom(Subscription)
    }

}
