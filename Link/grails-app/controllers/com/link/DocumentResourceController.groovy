package com.link

import com.link.CO.DocumentResourceCO
import grails.plugin.springsecurity.SpringSecurityService
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class DocumentResourceController {
    DocumentResourceService documentResourceService
    SpringSecurityService springSecurityService

    def index() {}

    def share(DocumentResourceCO documentresourceCO) {
        User createdBy = springSecurityService.getCurrentUser()
        String get = documentResourceService.create(documentresourceCO, createdBy)

        render get
    }
}
