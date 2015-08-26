class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$exportFormat)?"{
            constraints {
                // apply constraints here
            }
        }

        "/$id?"( controller:'url', action:'index' )
        "500"(view:'/error')
    }
}

