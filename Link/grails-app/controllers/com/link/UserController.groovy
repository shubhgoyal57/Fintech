package com.link

import com.link.CO.SignupCO
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class UserController {
    UserService userService
    def springSecurityService
    def mailService

    def index() {

    }

    def save(SignupCO signupco) {

        String s = userService.create(signupco)
//        mailService.sendMail {
//            to "shubham@fintechlabs.in"
//            from "shubhgoyal57@gmail.com"
//
//            subject "trying"
//            text 'i am in link'
//        }

        render(view: '/login/login')
        //render s
    }

    def register() {
//        String s=userService.update()

        render(view: '/login/forget')
    }

    def reset() {

        String s = (String) params.username

        flash.username1 = s

        render(view: '/login/reset', model: [user: s])
    }

    def change() {
        String newPassword = (String) params.password

        def username2 = flash.username1
        String s = userService.update(newPassword, username2)
        render(view: '/login/login')

    }
}
