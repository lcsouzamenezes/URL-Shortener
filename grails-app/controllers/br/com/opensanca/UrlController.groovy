package br.com.opensanca

class UrlController {
    def urlService

    def index(String id) {
        log.debug(id)
        def url = urlService.recuperar(id)
        if (url.size() == 0) {
            render(view: "index")
            return
        }else {
            redirect(url: url[0].link)
        }
    }

    def cadastro (params){
        def url = urlService.salvar(params)

        return url
    }


}
