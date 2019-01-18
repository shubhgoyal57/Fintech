package com.link


import com.link.CO.LinkResourceCO
import grails.gorm.transactions.Transactional

@Transactional
class LinkResourceService {

    def serviceMethod() {

    }

    def create(LinkResourceCO linkresourceCO, User createdBy) {
        LinkResource linkResource = new LinkResource(linkresourceCO, createdBy)
        if (!linkResource.save(flush: true)) {
            linkResource.errors.allErrors.each {
                println(it)
            }
        }
        return "link shared"
    }

    def read() {

    }

    def update() {

    }

    def delete() {

    }
}
