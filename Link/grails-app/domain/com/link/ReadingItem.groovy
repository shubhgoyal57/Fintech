package com.link

class ReadingItem {
    Resource resource
    User user
    Boolean isRead

    static belongsTo = [user: User]

    static constraints = {
        user(blank: false, nullable: false)
        resource(blank: false, nullable: false)
        isRead(blank: false, nullable: false)
    }
}
