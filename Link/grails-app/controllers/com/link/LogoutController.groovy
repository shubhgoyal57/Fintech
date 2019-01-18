package com.link

class LogoutController {

    def index() {
        session.invalidate()
        redirect(controller: 'login')
    }
}
