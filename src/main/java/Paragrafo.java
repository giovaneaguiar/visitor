class Paragrafo implements Visitable {
    private String texto;

    public Paragrafo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}