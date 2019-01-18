//grails.plugin.springsecurity.auth.loginFormUrl='/signup/index'

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.link.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.link.UserRole'
grails.plugin.springsecurity.authority.className = 'com.link.Role'
//grails.plugin.springsecurity.userLookup.usernamePropertyName = 'email'
//grails.plugins.springsecurity.successHandler.alwaysUseDefault = true
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/topic/index'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]
grails {
	mail {
		host = "smtp.gmail.com"
		port = 465
		username = "shubhgoyal57@gmail.com"
		password = "12shubhu"
		props = ["mail.smtp.auth":"true",
				 "mail.smtp.socketFactory.port":"465",
				 "mail.smtp.socketFactory.class":"javax.net.ssl.SSLSocketFactory",
				 "mail.smtp.socketFactory.fallback":"false"]
	}
}
