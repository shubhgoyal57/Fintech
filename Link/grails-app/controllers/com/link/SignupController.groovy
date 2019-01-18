package com.link

import com.link.CO.SignupCO
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class SignupController {

    UserService userService

    def index() {
        render(view: 'login')
    }

    def save(SignupCO signupco) {
        String s = userService.create(signupco)

        redirect(action: "home")
    }

    @Secured('permitAll')
    def home() {
        render "hello its me"
    }

    @Secured('permitAll')
    def check() {
        render("we are logged in")
    }
}
