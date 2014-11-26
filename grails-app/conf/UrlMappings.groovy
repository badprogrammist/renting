class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {

            }
        }
        "/places"(controller: "place", action: "list")
        "/events"(controller: "event", action: "list")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
