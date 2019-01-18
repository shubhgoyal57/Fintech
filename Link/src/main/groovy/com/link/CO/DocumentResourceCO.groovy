package com.link.CO

import com.link.DocumentResource
import com.link.Resource
import grails.validation.Validateable

class DocumentResourceCO extends Resource implements Validateable {
    String filePath
    static constraints={
        importFrom(DocumentResource)
    }
}
