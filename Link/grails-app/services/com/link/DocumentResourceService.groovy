package com.link

import com.link.CO.DocumentResourceCO
import grails.gorm.transactions.Transactional

@Transactional
class DocumentResourceService {

    def serviceMethod() {

    }

    def create(DocumentResourceCO documentresourceCO, User createdBy) {
        DocumentResource documentResource = new DocumentResource(documentresourceCO, createdBy)
        if (!documentResource.save(flush: true)) {
            documentResource.errors.allErrors.each {
                println(it)
            }
        }
        return "doc shared"
    }

    def read() {

    }

    def update() {

    }

    def delete() {

    }
}
