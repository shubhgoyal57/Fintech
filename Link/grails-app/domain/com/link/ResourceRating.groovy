package com.link


class ResourceRating {
    Resource resource
    User user
    Integer score

    static belongsTo = [user: User]

    static constraints = {
        resource(blank: false, nullable: false)
        user(blank: false, nullable: false)
        score(blank: false, nullable: false)
    }
}
