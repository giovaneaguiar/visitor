class ProcessadorDocumento implements Visitor {
    private int totalPalavras = 0;
    private StringBuilder html = new StringBuilder();

    @Override
    public void visitar(Paragrafo paragrafo) {
        String texto = paragrafo.getTexto();
        totalPalavras += texto.split("\\s+").length;
    }

    @Override
    public void visitar(Imagem imagem) {
        String src = imagem.getSrc();
        html.append("<img src='" + src + "'>");
    }

    @Override
    public void visitar(Secao secao) {
        html.append("<div>");
        for (Visitable elemento : secao.getElementos()) {
            elemento.aceitar(this);
        }
        html.append("</div>");
    }

    public int getTotalPalavras() {
        return totalPalavras;
    }

    public String getHTML() {
        return html.toString();
    }
}