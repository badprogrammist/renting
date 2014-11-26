package renting.register

import org.springframework.security.access.annotation.Secured

@Secured(['permitAll'])
class RegisterController extends grails.plugin.springsecurity.ui.RegisterController {
}
