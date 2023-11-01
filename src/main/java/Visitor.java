interface Visitor {
    void visitar(Paragrafo paragrafo);
    void visitar(Imagem imagem);
    void visitar(Secao secao);
}