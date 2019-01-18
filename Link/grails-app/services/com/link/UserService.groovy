package com.link

import com.link.CO.SignupCO
import grails.gorm.transactions.Transactional
import grails.plugin.springsecurity.SpringSecurityService

@Transactional
class UserService {

    def serviceMethod() {

    }

    SpringSecurityService springSecurityService


    def create(SignupCO signupco) {

        if (signupco.validate()) {
            User user = new User(signupco)
            user.save(flush: true)
            Role role = Role.findOrCreateByAuthority("ROLE_USER")
            UserRole.create(user, role, true)
            UserRole.withSession {
                it.flush()
                it.clear()
            }
        } else {
            signupco.errors.allErrors.each {
                println(it)
            }
        }
        return "Success"
    }

    def update(String newPassword, String username2) {
        def resetPassword = User.findByUsername(username2)
        resetPassword.password = newPassword
        resetPassword.save(flush: true)
        return "abc"
    }

    def read(String s) {

    }

    def delete() {

    }
}
