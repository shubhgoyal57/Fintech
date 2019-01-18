package com.link

import com.link.CO.LinkResourceCO

class LinkResource extends Resource {
    String url


    LinkResource(LinkResourceCO linkResourceCO, User createdBy) {
        this.description = linkResourceCO.description
        this.createdBy = createdBy
        this.topic = linkResourceCO.topic
        this.url = linkResourceCO.url
    }
    static constraints = {
        url(blank: false, nullable: false)
    }
}