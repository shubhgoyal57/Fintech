package com.link.CO

import com.link.LinkResource
import com.link.Resource
import grails.validation.Validateable

class LinkResourceCO extends Resource implements Validateable {
    String url

    static constraints={
        importFrom(LinkResource)
    }
}
