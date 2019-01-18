package com.link

class Resource {
    String description
    User createdBy
    Topic topic
    Date lastUpdated
    Date dateCreated

    static belongsTo = [createdBy: User, topic: Topic]

    static hasMany = [readingitem: ReadingItem]

    static constraints = {
        description(blank: false, nullable: false)
        createdBy(blank: false, nullable: false)
        topic(blank: false, nullable: false)
    }
    static mapping = {
        tablePerHierarchy false
    }
}
