package link

import com.link.Role
import com.link.User
import com.link.UserRole

class BootStrap {

    def init = { servletContext ->
//        def role=new Role('ROLE_ADMIN')
//        role.save()
//        def testUser=new User(firstName: 'shubham',lastName: 'goyal',email: 'shubhgoyal57@gmail.com', username:'shubhgoyal57@gmail.com',password: 'shubham')
//        testUser.save()
//        UserRole.create(testUser,role)
//        UserRole.withSession {
//            it.flush()
//            it.clear()
//        }

        def adminRole= Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def user= User.findOrSaveWhere(firstName: 'shubham',lastName: 'goyal',email: 'shubhgoyal57@gmail.com', username:'shubhgoyal57@gmail.com',password: 'shubham')

        if(!user.authorities.contains(adminRole))
        {
            UserRole.create(user,adminRole,true)
            UserRole.withSession {
                it.flush()
                it.clear()
            }
        }


        def adminRole1= Role.findOrSaveWhere(authority: 'ROLE_USER')
        def user1= User.findOrSaveWhere(firstName: 'aziz',lastName: 'khosa',email: 'aziz@gmail.com', username:'aziz@gmail.com',password: 'aziz')

        if(!user.authorities.contains(adminRole1))
        {
            UserRole.create(user1,adminRole1,true)
            UserRole.withSession {
                it.flush()
                it.clear()
            }
        }

    }
    def destroy = {
    }
}
