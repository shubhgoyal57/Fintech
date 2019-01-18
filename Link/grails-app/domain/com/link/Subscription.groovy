package com.link

import com.link.CO.SubscriptionCO
import com.link.ENUMS.Seriousness

class Subscription {
    User user
    Topic topic
    Date dateCreated
    Seriousness seriousness

    public Subscription(def seriousness,User user,Topic topic)
    {
        this.user=user
        this.topic=topic
        this.seriousness=seriousness
    }
    static constraints = {
        user(blank: false, nullable: false)
        topic(blank: false, nullable: false)
        seriousness(blank:true)
    }
}
