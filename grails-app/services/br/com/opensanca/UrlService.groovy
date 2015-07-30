package br.com.opensanca

import grails.transaction.Transactional
import org.apache.commons.lang.RandomStringUtils

@Transactional
class UrlService {

    def salvar(params){
        String charset = (('A'..'Z') + ('0'..'9')).join()
        Integer length = 7
        String randomString = RandomStringUtils.random(length, charset.toCharArray())
        log.debug(randomString)
        UrlShortener url = new UrlShortener()
            url.id = randomString
            url.link = params.url
            url.data_expiracao = new Date()
            url.save(failOnError: true)

        return url
    }

    def recuperar (id){
        def url = UrlShortener.findAllById(id)

        return url
    }

    def limparExpirados(){

    }
}
