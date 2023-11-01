class Imagem implements Visitable {
    private String src;

    public Imagem(String src) {
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}