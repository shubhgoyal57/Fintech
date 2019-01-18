package com.link

import com.link.CO.LinkResourceCO
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class LinkResourseController {
    SpringSecurityService springSecurityService
    LinkResourceService linkResourceService

    def index() {}

    def share(LinkResourceCO linkResourceCO) {
        User createdBy = springSecurityService.getCurrentUser()
        String get = linkResourceService.create(linkResourceCO, createdBy)
        render get
    }
}
