package com.link

import com.link.CO.SignupCO
import com.link.ENUMS.Visibility
import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class SignupController {

    UserService userService

    def index() {
        println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        List list=Topic.findAll([sort:"dateCreated",order:"desc"])
        List publicTopics=new ArrayList()
        int count=0
        for(def lists:list){
            if (lists.visibility== Visibility.PUBLIC)
            {
               publicTopics.add(lists)
                count++
            }
            else{
                println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+lists)

            }
            if(count==5){
                break
            }
        }
//
        render(view: '/login/auth' ,model:[publicTopics:publicTopics] )
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
