package com.link

import com.link.CO.DocumentResourceCO


class DocumentResource extends Resource {
    String filePath

    DocumentResource(DocumentResourceCO documentresourceCO, User createdBy) {
        this.description = documentresourceCO.description
        this.createdBy = createdBy
        this.topic = documentresourceCO.topic
        this.filePath = documentresourceCO.filePath
    }
    static constraints = {
        filePath(blank: false, nullable: false)
    }
}
