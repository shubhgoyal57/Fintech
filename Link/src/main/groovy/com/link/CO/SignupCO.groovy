package com.link.CO

import com.link.User
import grails.validation.Validateable


class SignupCO implements Validateable {

    String firstName
    String lastName
    String email
    String username
    String password
    String confirmPassword





    static constraints={
        importFrom(User)

        confirmPassword nullable: false, blank: false, validator: { val, object ->
            if ((object.confirmPassword != object.password)) {
                return 'passwordMismatch'
            }
        }



    }




}