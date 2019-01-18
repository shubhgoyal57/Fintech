package com.link

import com.link.CO.TopicCO
import com.link.ENUMS.Visibility

class Topic {
    String name
    User createdBy
    Date lastUpdated
    Date dateCreated
    Visibility visibility

    static belongsTo = [createdBy: User]

    static hasMany = [subscription: Subscription, resource: Resource]

    Topic(TopicCO topicCO, User createdBy) {
        this.name = topicCO.name
        this.visibility = topicCO.visibility
        this.createdBy = createdBy
    }

    static constraints = {
        name(blank: false)
        createdBy(blank: false, nullable: true)
        visibility(blank: true)
    }
}
