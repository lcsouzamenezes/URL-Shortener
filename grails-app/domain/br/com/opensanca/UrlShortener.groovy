package br.com.opensanca

class UrlShortener {
    String id
    String link
    Date data_expiracao

    static mapping = {
        id column:'id', generator:'assigned', type:'string', name:'id'
    }
}
