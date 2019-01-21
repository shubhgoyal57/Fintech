package com.link

import com.link.CO.SignupCO
import grails.compiler.GrailsCompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@GrailsCompileStatic
@EqualsAndHashCode(includes = 'username')
@ToString(includes = 'username', includeNames = true, includePackage = false)
class User implements Serializable {

    private static final long serialVersionUID = 1
    String firstName
    String lastName
    String email
    String username
    String password
    boolean enabled = true


    String confirmPassword

    Boolean admin = false
    Date lastUpdated
    Date dateCreated
    boolean accountExpired = false
    boolean accountLocked = false
    boolean passwordExpired = false
    

    Set<Role> getAuthorities() {
        (UserRole.findAllByUser(this) as List<UserRole>)*.role as Set<Role>
    }

    static hasMany = [topic: Topic, subscription: Subscription, resourse: Resource, resourceratin: ResourceRating, readinitem: ReadingItem]


    static transients = ['confirmPassword']

    User(SignupCO signupco) {
        this.firstName = signupco.firstName
        this.lastName = signupco.lastName
        this.email = signupco.email
        this.username = signupco.username
        this.password = signupco.password

    }

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        email(blank: false, unique: true)
        username(blank: false, unique: true)
        password(blank: false)

        confirmPassword(blank: false)

    }


    static mapping = {
        password column: '`password`'
    }
}
