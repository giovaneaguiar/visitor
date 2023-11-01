
class Secao implements Visitable {
    private java.util.List<Visitable> elementos = new java.util.ArrayList<>();

    public void adicionarElemento(Visitable elemento) {
        elementos.add(elemento);
    }

    public java.util.List<Visitable> getElementos() {
        return elementos;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}